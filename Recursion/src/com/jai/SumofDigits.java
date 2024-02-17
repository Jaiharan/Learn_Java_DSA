package com.jai;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sumofDigits(123));
    }

    static int sumofDigits(int n){
        if(n == 0){
            return 0;
        }
        return sumofDigits(n/10)+(n%10);
    }
}
