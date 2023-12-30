package com.jai;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 34;
        arr[2] = 45;
        arr[3] = 323;
        arr[4] = 643563;
        // {5, 34, 45, 323, 643563}
        System.out.println(arr[3]);

        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//        for (int j : arr) { // for every element in array it print element
//            System.out.print(j + " ");// j represents the element of array
//        }

//        System.out.println(arr[5]); index out of bound err



        // Array of Objects
        String[] Str = new String[5];
        for (int i = 0; i < Str.length; i++) {
            Str[i] = in.next();
        }

        System.out.println(Arrays.toString(Str));

        // modify
        Str[2] = "Jai"; // modify elements  by assigning ref var
        System.out.println(Arrays.toString(Str));

    }
}
