package com.jai;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern1(int n){
        /*     *
               * *
               * * *
               * * * *
        */
        for (int row = 1; row <= n; row++) {
            // for every row run col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        /*   * * * *
             * * * *
             * * * *
             * * * *
         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        /*   * * * *
             * * *
             * *
             *
        */

//        for (int row = n; row >= 1; row--) {
//            for (int col = row; col >= 1; col--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < n; row++) {
            // for every row , run col
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){

        /*  1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
        */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        /*   *
             * *
             * * *
             * * * *
             * * * * *
             * * * *
             * * *
             * *
             *
         */
        for (int row = 1; row <= 2*n; row++) {
            int totalcolsinrow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalcolsinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalcolsinrow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalcolsinrow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){

        /*      1
               212
              32123
             4321234
            543212345  */

        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }static void pattern8(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        /*  5 5 5 5 5 5 5 5 5
            5 4 4 4 4 4 4 4 5
            5 4 3 3 3 3 3 4 5
            5 4 3 2 2 2 3 4 5
            5 4 3 2 1 2 3 4 5
            5 4 3 2 2 2 3 4 5
            5 4 3 3 3 3 3 4 5
            5 4 4 4 4 4 4 4 5
            5 5 5 5 5 5 5 5 5    */
        int OGn = n;
        n = 2 * n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int atEveryIndex = OGn + 1 - Math.min(Math.min(row, col), Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}