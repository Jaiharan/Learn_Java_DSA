package com.jai;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int[] nums = {25, 45, 60, 3, 25, 425, 64, -3, -52, -2};
    int target = 64;
    int ans = linearSearch(nums,target);
        System.out.println(ans);

    }

    // search the target and return the true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return  false;
        }

        // run for loop
        for (int element : arr) {
            // check for element at every index if it is target
            if (element == target) {
                return true;
            }
        }

        //this line will execute if none of return statement above executed
        //hence the target not found
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }

        // run for loop
        for (int element : arr) {
            // check for element at every index if it is target
            if (element == target) {
                return element;
            }
        }

        //this line will execute if none of return statement above executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }


    // search in the array : return the index if item found
    // otherwise return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }

        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        //this line will execute if none of return statement above executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }
}