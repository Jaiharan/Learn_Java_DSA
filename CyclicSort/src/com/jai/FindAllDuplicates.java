package com.jai;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++) { // here don't need to redeclare i using int
            if(arr[i] != i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
