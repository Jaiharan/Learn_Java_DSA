package com.jai;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

        if(slow == 1) {
            return true;
        }
        return false;

    }

    private static int findSquare(int number) {
        int ans = 0;
        while(number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
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

        System.out.println(isHappy(19));
    }
}