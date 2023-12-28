package com.jai;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,6,43,352,25,25214);
//        multiple(2,3,"Jai","Rahul");// must be in order
//        demo();

    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple( int a , int b , String ...v){// ... it should be always on end
    }

    static void fun(int ...v){ // ...argname used to declare getting array or collections of arguments into module
        System.out.println(Arrays.toString(v));
    }
}
