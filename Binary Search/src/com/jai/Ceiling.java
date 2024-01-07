package com.jai;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }


    // return the index of smallest no >= target
    static int Ceiling(int[] arr, int target) {

        // what if target is greater than greatest number in array
        if(target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle elemnet
//            int mid = (start + end) / 2;  // Might be possible that start and value exceeds range of integer in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
