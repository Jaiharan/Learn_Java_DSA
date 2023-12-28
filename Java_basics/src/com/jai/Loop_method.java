package com.jai;

import java.util.Scanner;

public class Loop_method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(("Enter start num:"));
        int start = input.nextInt();
        System.out.println(("Enter end num:"));
        int end = input.nextInt();
        for (int i=start; i<end+1; i++){
            System.out.println(i);
        }
    }
}
