package com.jai;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }

    // assume arr.length !=0
    // return the min value in array
    static int min(int[] arr){
        int ans = arr[0];
        for (int j : arr) {
            if (j < ans) {
                ans = j;
            }
        }
        return ans;
    }
}
