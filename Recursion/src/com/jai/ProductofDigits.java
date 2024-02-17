package com.jai;

public class ProductofDigits {
    public static void main(String[] args) {
        System.out.println(productofDigits(1234));
    }

    static  int productofDigits(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10)*productofDigits(n/10);
    }
}
