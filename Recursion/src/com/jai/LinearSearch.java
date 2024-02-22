package com.jai;

import java.lang.reflect.Array;
import java.util.ArrayList;

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

    static ArrayList<Integer> list = new ArrayList<>();
     static void FindAllIndex(int[] arr, int target, int index){
        //base condition
        if (index == arr.length) {
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        FindAllIndex(arr,target,index+1);

    }


    static ArrayList<Integer> FindAllIndexIntern(int[] arr, int target, int index,ArrayList<Integer> list1){
        //base condition
        if (index == arr.length) {
            return list1;
        }
        if(arr[index] == target){
            list1.add(index);
        }
        return FindAllIndexIntern(arr,target,index+1,list1);
    }


    // Without using Argument
    public static ArrayList<Integer> FindIndexOutArg(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
         //basecondition
        if(index == arr.length){
            return list;
        }
        // this will contain ans for that func call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansForBelowCalls =  FindIndexOutArg(arr,target,index+1);
        list.addAll(ansForBelowCalls);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {2,265,757,252,5876,2525,252,74};
//        System.out.println(LinearSearch2(arr,74,0));
//        ArrayList<Integer> ans = FindAllIndexIntern(arr,252,0,new ArrayList<>());
//        System.out.println(ans);
        System.out.println(FindIndexOutArg(arr,252,0));
    }
}
