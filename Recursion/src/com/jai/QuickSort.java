package com.jai;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] nums,int low, int high) {
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while(s <= e){
            // if it already sorted it will not swap
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index, sort two half now
        quick(nums,low,e);
        quick(nums,s,high);
    }
}
