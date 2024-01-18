package com.jai;

public class RemoveDuplicate {
        public static void main(String[] args) {
            int[] A = {1, 2, 2, 4};
            int N = A.length;
            System.out.println(remove_duplicate(A,N));

        }

        static int remove_duplicate(int A[],int N){
            // code here
            //two pointer approach

            int i=0;
            for(int j=1; j<A.length; j++)
            {
                if(A[j] != A[i])
                {
                    A[i+1] = A[j];
                    i++;
                }

            }


            return i+1;
        }
}
