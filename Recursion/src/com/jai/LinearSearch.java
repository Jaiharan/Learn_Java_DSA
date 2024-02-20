package com.jai;

public class LinearSearch {

    public static int LinearSearch(int[] arr, int target, int index){
        //base condition
        if(arr[index] == target){
            return index;
        } else if (index == arr.length - 1) {
            return -1;
        }
        return LinearSearch(arr,target,index+1);
    }
    public static boolean LinearSearch2(int[] arr, int target, int index){
        //base condition
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || LinearSearch2(arr,target,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,265,757,252,5876,2525,74};
        System.out.println(LinearSearch2(arr,74,0));
    }
}
