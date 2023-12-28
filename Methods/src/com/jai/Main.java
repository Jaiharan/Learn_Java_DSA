package com.jai;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Take input of two numbers and print sum
        Scanner in = new Scanner(System.in);
        int num1 , num2 , sum;
        System.out.println("Enter num 1: ");
        num1 = in.nextInt();
        System.out.println("Enter num 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = "+sum);


    }
}