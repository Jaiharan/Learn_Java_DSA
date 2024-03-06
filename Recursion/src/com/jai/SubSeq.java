package com.jai;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subseqASCII("","abc");
//        System.out.println(subseqRet("","abc"));
        System.out.println(subseqRetASCII("","abc"));
    }

    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p+ch,up.substring(1));
        ArrayList<String> right = subseqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }


    static void subseqASCII(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqASCII(p+ch,up.substring(1));
        subseqASCII(p,up.substring(1));
        subseqASCII(p+(ch+0),up.substring(1));
    }

    static ArrayList<String> subseqRetASCII(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subseqRetASCII(p+ch,up.substring(1));
        ArrayList<String> second = subseqRetASCII(p,up.substring(1));
        ArrayList<String> third = subseqRetASCII(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
