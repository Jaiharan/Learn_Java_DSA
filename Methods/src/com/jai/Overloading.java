package com.jai;

public class Overloading {
    public static void main(String[] args) {
        fun(67);// at compile time it decides which function should run based on its parameters
        fun("String");
        int ans = sum(3,4,8);
        System.out.println(ans);
    }

    static int sum(int a , int b){
        return a + b;
    }static int sum(int a , int b, int c){
        return a + b + c;
    }

    static void fun(int a){
        System.out.println("hey one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Hey two");
        System.out.println(name);
    }
}
