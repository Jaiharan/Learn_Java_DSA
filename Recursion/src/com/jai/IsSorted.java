package com.jai;

public class IsSorted {

    // USING RECURSION
    public static boolean IsSorted2(int[] arr,int index){
        // base condition
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && IsSorted2(arr,index + 1);
    }

    // USING TWO_POINTER
    public static boolean IsSorted(int[] arr){
        int i = 0;
        for(int j=1; j<arr.length;j++){
            if(arr[i] > arr[j]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8,7};
        System.out.println(IsSorted2(arr,0));
    }
}
