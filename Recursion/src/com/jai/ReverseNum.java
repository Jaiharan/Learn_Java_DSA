package com.jai;

public class ReverseNum {
    public static void main(String[] args) {
//        reverseNum1(24626);
//        System.out.println(sum);
        System.out.println(reverseNum2(672524));
    }
    static  int sum = 0;

    static void reverseNum1(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNum1(n/10);
    }

    static int reverseNum2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
