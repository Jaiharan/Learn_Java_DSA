package com.jai;

import java.util.Arrays;
import java.util.Scanner;

public class MultiD {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
//        int[][] arr ={
//                {1, 2, 3},// index 0
//                {4, 5},// index 1
//                {7, 8, 9},//index 2
//        };
//        System.out.println(Arrays.toString(arr[1]));
        int[][] arr = new int[3][3];
        //input
        for (int row = 0;row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
        for (int[] ints : arr) {
            //for each col in every row
            System.out.println(Arrays.toString(ints));
        }

    }
}
