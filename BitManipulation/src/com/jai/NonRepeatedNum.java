package com.jai;

import java.util.Arrays;

public class NonRepeatedNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,1,2,3,4};
        System.out.println(FindUnique(arr));
    }

    private static int FindUnique(int[] arr) {
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }


//    // brute force approach
//    private static int isNonRepeated(int[] arr) {
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                i++; // Skip the repeated element
//            } else {
//                return arr[i]; // Non-repeated element found
//            }
//        }
//        // If the last element is non-repeated, return it
//        return arr[arr.length - 1];
//    }
}
