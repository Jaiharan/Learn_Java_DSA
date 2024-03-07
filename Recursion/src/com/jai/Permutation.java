package com.jai;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        permutations("","abc");
//        System.out.println(permutationsCount("","abcd"));
//        ArrayList<String> ans = permutationsList("","abcde");
//        System.out.println(ans);
        int ans = permutationsArgCount("","abc",0);
        System.out.println(ans);
    }

    static void permutations(String p,String up){
        // base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String up){
        // base condition
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        // local to this call
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsList(f+ch+s,up.substring(1)));
        }

        return ans;
    }

    static int permutationsCount(String p,String up){
        // base condition
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permutationsCount(f+ch+s,up.substring(1));
        }
        return count;
    }

    static int permutationsArgCount(String p, String up, int count) {
        // base condition
        if (up.isEmpty()) {
            return count + 1;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = permutationsArgCount(f + ch + s, up.substring(1), count);
        }
        return count;
    }

}
