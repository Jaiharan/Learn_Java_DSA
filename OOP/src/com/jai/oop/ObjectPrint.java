package com.jai.oop;

public class ObjectPrint {
    int n;

    public ObjectPrint(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return ""+n;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(34);
        System.out.println(obj);
    }
}
