package com.jai;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isOdd(int num){
        return (num & 1) == 1;
    }
    public static void main(String[] args) {
        int num = 234;
        System.out.println(isOdd(num));
    }
}