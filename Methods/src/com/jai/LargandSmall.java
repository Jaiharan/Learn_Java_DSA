package com.jai;

import java.util.Scanner;

public class LargandSmall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int largest = larg(num1,num2,num3);
        int smallest = smal(num1,num2,num3);
        System.out.println(largest);
        System.out.println(smallest);

    }
    static int larg(int num1, int num2, int num3){
        if (num1>num2) {
            if (num1 > num3) {
                return num1;
            }
        }else{
            if (num2>num3) return num2;
        }
        return num3;
    };static int smal(int num1, int num2, int num3){
        if (num1<num2) {
            if (num1 < num3) {
                return num1;
            }
        }else{
            if (num2<num3) return num2;
        }
        return num3;
    };
}

/* Most Effective way to find largest and smallest numbers

    import java.util.Scanner;

public class LargandSmall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int largest = findLargest(num1, num2, num3);
        int smallest = findSmallest(num1, num2, num3);

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }

    static int findLargest(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    static int findSmallest(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}

 */
