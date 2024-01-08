package com.jai;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        // what if target is greater than greatest number in array
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // Find the middle elemnet
//            int mid = (start + end) / 2;  // Might be possible that start and value exceeds range of integer in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }


    // return the index of smallest no >= target
    static int Ceiling(int[] letters, int target) {

        // what if target is greater than greatest number in array
        if(target > letters[letters.length -1]){
            return -1;
        }
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // Find the middle elemnet
//            int mid = (start + end) / 2;  // Might be possible that start and value exceeds range of integer in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
