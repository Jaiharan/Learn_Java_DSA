package com.jai;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ans = fibo(2);
        System.out.println(ans);
    }

    static int fibo(int n){
        // base condition
        if(n < 2) {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}