package com.jai;

public class Strings {
    public static void main(String[] args) {
//        skipA("","bsvafabnvah");
//        System.out.println(skipA1("bsvafabnvah"));
        System.out.println(skipString("bsvappleafabnvah"));
    }

    static void skipA(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a') {
            skipA(p,up.substring(1));
        } else {
            skipA(p + ch,up.substring(1));
        }
    }

    static String skipA1(String up) {
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch == 'a') {
            return skipA1(up.substring(1));
        } else {
            return ch + skipA1(up.substring(1));
        }
    }

    static String skipString(String up) {
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")) {
            return skipString(up.substring(5));
        } else {
            return up.charAt(0) + skipString(up.substring(1));
        }
    }
}
