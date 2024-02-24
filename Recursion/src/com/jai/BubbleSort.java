package com.jai;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
//        BubbleUsingRecursive(arr, arr.length-1, 0);
        SelectionUsingRecursive(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleUsingRecursive(int[] arr,int r,int c){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            BubbleUsingRecursive(arr,r,c+1);
        } else {
            BubbleUsingRecursive(arr,r-1,0);
        }
    }

    static void SelectionUsingRecursive(int[] arr,int r,int c,int max){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[max]){
               SelectionUsingRecursive(arr,r,c+1,c);
            } else {
                SelectionUsingRecursive(arr,r,c+1,max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            SelectionUsingRecursive(arr,r-1,0,0);
        }
    }
}
