package com.jai;
// https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArrayLargest {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in end of loop this will contain tge max item from the array
            end += nums[i];
        }

        // binary search
        while(start < end){
            // try for the mid as potential ans
            int mid = start + (end - start) / 2;
            // calculate how many pieces u can divide this in max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // you cannot add this in sub array make new ne
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // here start == end
    }
}
