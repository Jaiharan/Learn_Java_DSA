package com.jai;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //anything in outside used in inside but anything in inside cannot be used in outside scope
        {
            a = 78;// reassign original ref variable to some other value

            int c =99;//values initize in block only remain in this block
        }
        System.out.println(a);
//        System.out.println(c);// cannot use outside of block

        //scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 1000;// cannot initialize same ref variable within module
            
        }
        System.out.println(a);
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
