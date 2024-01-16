package com.jai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rotateArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 6, 11, 12, 17));
        int k = 4;

        ArrayList<Integer> result = rotateArray(arr, k);

        System.out.println(result);
    }


    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();

        // Handle case when k is greater than n
        k = k % n;

        // Reverse the entire array
        reverseArray(arr, 0, n - 1);
        System.out.println(arr);

        // Reverse the first part of the array
        reverseArray(arr, 0, n - k - 1);
        System.out.println(arr);

        // Reverse the second part of the array
        reverseArray(arr, n - k, n - 1);
        System.out.println(arr);

        return arr;
    }

    static void reverseArray(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            Collections.swap(arr, start, end);

            // Move indices towards the center
            start++;
            end--;
        }
    }

}
