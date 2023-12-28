package com.jai;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String msg = greet();
//        System.out.println(msg);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String msg = myGreet(name);
        System.out.println(msg);
    }

    static String myGreet(String name) {
        String message = "Hello " + name.toUpperCase();
        return message;
    }

    static String greet(){
        String greeting = "Hey Buddy";
        return greeting;
    }
}
