package com.jai;

import java.util.Arrays;

public class Passinginfunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 12, 43};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int arr[]){
        arr[0] = 99;
    }
}
