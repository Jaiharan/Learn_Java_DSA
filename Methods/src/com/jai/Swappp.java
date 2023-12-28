package com.jai;

public class Swappp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //method to swap numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);

        System.out.println(a +" "+b);

        String name = "Jaiharan";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Nikul";
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
