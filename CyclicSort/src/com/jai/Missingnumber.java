package com.jai;
//https://leetcode.com/problems/missing-number/

import java.util.Arrays;

class Missingnumber {
    public static void main(String[] args) {
        int[] nums = { 0, 1};
        int result = missingNumber(nums);
        System.out.println(result);
    }
    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }
        }

        // search for first miss num
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}