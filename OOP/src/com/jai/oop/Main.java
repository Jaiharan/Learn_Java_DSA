package com.jai.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shapes = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Shape c1 = new Circle();

        c1.area();
        circle.area();
    }
}