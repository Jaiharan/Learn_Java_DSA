package com.jai;

public class Comparision {
    public static void main(String[] args) {
        String name = new String("Jaiharan");
        String user = new String("Jaiharan"); // create new object by using new keyword it doesn't assign to same objects
        System.out.println(name == user); // == checks pointing to same object or not
        System.out.println(name.equals(user));// .equals only check values
    }
}
