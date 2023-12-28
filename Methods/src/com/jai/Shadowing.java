package com.jai;

public class Shadowing {
    static int x = 90;// it is shadowed when redeclaring ref variable
    public static void main(String[] args) {
        System.out.println(x); //90
        int x; // class variable in line four is shadowed
//        System.out.println(x); //scope only begin when value is initialised
        x = 40; //initializing
        System.out.println(x); //40
        num();
    }
    static void num(){
        System.out.println(x);
    } //90
}
