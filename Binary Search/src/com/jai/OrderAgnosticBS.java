package com.jai;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 18, 22, 45, 69, 89};
        int[] arr = {109, 93, 83, 72, 69, 34, 23, 18, 9, 5, 2, 1};
        int target = 69;
        int ans = OrderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

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
