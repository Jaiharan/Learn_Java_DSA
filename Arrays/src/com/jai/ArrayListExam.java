package com.jai;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>(10);
        List.add(67);
        List.add(6757);
        List.add(67467);
        List.add(67426);
        List.add(672654);
        List.add(63532);

        System.out.println(List.contains(67));

        List.set(0,99);

        List.remove((2));

        System.out.println(List);

        //input
        for (int i = 0; i < 5; i++) {
            List.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(List.get(i)); // pass index : list[index] syntax will not work here
        }
        System.out.println(List);
    }
}
