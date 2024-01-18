package com.jai;

import java.util.ArrayList;
import java.util.List;

class Disappearednums {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        // here I used cyclic sort to sort array and duplicates left at missing num index so finally return the missing element.
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (i = 0; i < arr.length; i++) { // here don't need to redeclare i using int
            if(i+1 != arr[i]){
                list.add(i+1);
            }
        }
        return list;
    }


    public void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}