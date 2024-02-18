package com.jai;

public class CountZeros {
    public static void main(String[] args) {
        int num = 506006305;
        System.out.println(CountZero2(num));
    }

    // Using Recursion
    private static int CountZero2(int n){
        return helper(n,0);
    }

    // Special pattern HOw to pass value to above calls
    private static int helper(int n, int c) {
        if (n == 0){
            return c;
        }

        int rem = n % 10;
        if(rem == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }


    // Changing num into String
    private static int CountZero(int num) {
        String num1 = Integer.toString(num);
        int count = 0;
        for (int i = 0; i<num1.length();i++){
            if (num1.charAt(i) == '0'){
                count++;
            }
        }
        return count;
    }
}
