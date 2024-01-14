package com.jai;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix,int row, int colstart, int colend, int target){
        while(colstart <= colend){
            int mid = colstart + (colend - colstart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                colstart = mid + 1;
            } else {
                colend = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;;
        int col = matrix[0].length; // be cautious, matrix may be empty

        if(rows == 1){
            return binarySearch(matrix,0,0,col-1,target);
        }
        int rstart = 0;
        int rend = rows - 1;
        int cmid = col/2;
        // run loop till two rows are remaining
        while(rstart < (rend - 1)) { // while this is true it will have more than two rows
            int mid = rstart + (rend - rstart) / 2;
            if(matrix[mid][cmid] == target){
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid] < target){
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        // now we have two rows
        // check whether target is in col of 2 rows
        if(matrix[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }if(matrix[rstart + 1][cmid] == target){
            return new int[]{rstart + 1,cmid};
        }

        // search in 1st half
        if (target <= matrix[rstart] [cmid - 1]) {
            return binarySearch(matrix,rstart,0,cmid - 1,target);
        }
        // search in 2nd half
        if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][col - 1]) {
            return binarySearch(matrix,rstart,cmid + 1,col - 1,target);
        }
        // search in 3rd half
        if (target <= matrix[rstart + 1][cmid - 1]) {
            return binarySearch(matrix,rstart + 1,0,cmid - 1,target);
        } else {
            return binarySearch(matrix,rstart + 1,cmid + 1,col - 1,target);
        }
    }
}
