package com.jai;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertF(2343);
        list.insertF(232);
        list.insertF(367);
        list.insertF(794);
        list.insertL(453467);
        list.insert(266,3);

        list.display();
        System.out.println(list.deleteF());
        list.display();
        System.out.println(list.deleteL());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}