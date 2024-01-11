package com.jai;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FindFirstAndLastOccu {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurance if target first
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;

    }

    // this func just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            // Find the middle elemnet
//            int mid = (start + end) / 2;  // Might be possible that start and value exceeds range of integer in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // if potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
