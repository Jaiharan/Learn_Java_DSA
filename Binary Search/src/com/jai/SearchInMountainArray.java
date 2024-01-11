package com.jai;
// https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstry = OrderAgnosticBS(arr, target, 0, peak);
        if(firstry != -1) {
            return firstry;
        }
        // try to search in second half
        return OrderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                // you r in decre part of array
                // this maybe the ans, but look left side values
                // this is y end != mid - 1
                end = mid;
            } else {
                // you r in ascen part of array
                start = mid + 1; // because we know that mid + 1 element > then mid elment so we ignore mid element
            }
        }
        // In the end start == end and pointing to largest number because of the above 2 checks
        // start and end always retry to find largest element in above two checks
        // hence if they pointing to same element it is the largest or peak element in array
        // MOre ellaboration: at every point of time for start and end they points to every possible large elemnt
        // and if that only one element is remaining, hence its the most possible largest element in array
        return start; // or return end bcause both are pointing at same element
    }

    static int OrderAgnosticBS(int[] arr,int target, int start, int end){

        // Find whether the array is sorted in ascen or desen
        boolean ascen = arr[start] < arr[end];


        while(start <= end){
            // Find the middle elemnet
//            int mid = (start + end) / 2;  // Might be possible that start and value exceeds range of integer in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if(ascen){
                if (target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
