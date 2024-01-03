package com.jai;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3},{3, 2, 1},{7, 8, 9}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {

        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when u start new col , take a new sum of that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            // now we have sum of accounts of person
            // check with overall ans
            ans = Math.max(ans, sum);
        }
        return  ans;
    }
}
