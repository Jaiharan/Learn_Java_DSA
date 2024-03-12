package com.jai;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceList("",4));
    }

    static void dice(String p,int target) {
        // base condition
        if(target==0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i,target - i);
        }
    }

    static ArrayList<String> diceList(String p, int target) {
        // base condition
        if(target==0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceList(p+i,target - i));
        }
        return list;
    }
}
