package com.jai;

// https://leetcode.com/problems/set-mismatch/submissions/1151388990/
public class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }

        // search for first miss num
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return new int[] {arr[index],index+ 1};
            }
        }
        return new int[] {-1,-1};
    }

    public void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
