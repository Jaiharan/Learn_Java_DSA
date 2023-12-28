package com.jai;

import java.util.Locale;
import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().toLowerCase().charAt((0));
        System.out.print(ch);
    }
}
