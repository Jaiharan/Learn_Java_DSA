package com.jai;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20 , 30);
        System.out.println(ans);
    }

    //pass value of numbers when calling method in main()

    static int sum3(int a , int b){
        int sum = a+b;
        return sum;
    }
    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = "+sum);
    }
    /*
        access modifier concept in oops return_type name (){
            //body
            return statement;

        }

     */

}
