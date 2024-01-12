package com.jai;
// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = search(arr,0);
        System.out.println(ans);
    }


    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find array it means that array not rotated
        if (pivot == -1){
            // just to normal binary search
            return binarySearch(nums,target,0,nums.length - 1);
        }

        // if pivot is found you found two ascen sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums,target,0,pivot - 1);
        }
        return binarySearch(nums,target,pivot + 1,nums.length - 1);

    }


    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            // Find the middle elemnet
//            int mid = (start + end) / 2;  // Might be possible that start and value exceeds range of integer in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                // ans found
                return mid;
            }
        }
        return -1;
    }


    // this will not work in duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 cases will be here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            } if (arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }static int findPivotWithduplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 cases will be here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            // if elements at middle, start, and end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end] ){
                // skip the duplicates

                // Note: what if the elements at start and end are pivots?
                // check if start is pivot
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                // check whether end is pivot
                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
