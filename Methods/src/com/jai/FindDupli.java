package com.jai;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDupli {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 3, 7, 5, 4};
        ArrayList<Integer> result = duplicates(arr);
        System.out.println(result);

    }
    static ArrayList<Integer> duplicates(int arr[]) {
        // code here
        // Create an ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();

        // Create two HashSet instances: 'set' to keep track of encountered elements,
        // and 'duplicates' to store elements that are duplicates
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            // If the element is not present in 'set', add it
            // If it's already present, add it to 'duplicates'
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        // Convert the 'duplicates' HashSet to an ArrayList
        result.addAll(duplicates);

        // Sort the ArrayList in ascending order
        result.sort(null);

        // If no duplicates are found, add -1 to the result
        if (result.isEmpty()) {
            result.add(-1);
        }

        // Return the final result ArrayList
        return result;
    }
}
