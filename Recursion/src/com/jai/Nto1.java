package com.jai;

public class Nto1 {
    public static void main(String[] args) {
        NtoOnetoN(5);
    }

    static void NtoOne(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        NtoOne(n-1);
    }

    static void OnetoN(int n){
        if(n == 0){
            return;
        }
        OnetoN(n-1);
        System.out.println(n);
    }

    static void NtoOnetoN(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        NtoOnetoN(n-1);
        System.out.println(n);
    }
}
