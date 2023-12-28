package com.jai;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Enter radius: ");
            int r = in.nextInt();
            if (r > 0){
                int ans = (int) (3.14 * r * r);
                System.out.println("Area of circle: " + ans);
            } else if (r == 'X' || r == 'x') {
                break;
            }
        }
    }
}
