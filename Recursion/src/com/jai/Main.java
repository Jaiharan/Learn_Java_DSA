package com.jai;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ans = fiboformula(50);
        System.out.println(ans);
    }

    static int fiboformula(int n){
        return (int)(Math.pow(((1 + Math.sqrt(5))/ 2), n) / Math.sqrt(5));
    }

    static int fibo(int n){
        // base condition
        if(n < 2) {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}