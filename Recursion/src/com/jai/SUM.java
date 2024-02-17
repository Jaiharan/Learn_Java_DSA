package com.jai;

public class SUM {
    public static void main(String[] args) {
        System.out.println(sumof(3000));
    }
    static int sumof(int n){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n+sumof(n-1);
    }
}
