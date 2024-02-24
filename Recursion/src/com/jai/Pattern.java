package com.jai;

public class Pattern {
    public static void main(String[] args) {
        ReducedBackwardtriangle(4,0);
        Increasingtriangle(4,0);
    }

    static void ReducedBackwardtriangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            ReducedBackwardtriangle(r,c+1);
        } else {
            System.out.println();
            ReducedBackwardtriangle(r-1,0);
        }
    }

    static void Increasingtriangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            Increasingtriangle(r,c+1);
            System.out.print("* ");
        } else {
            Increasingtriangle(r-1,0);
            System.out.println();
        }
    }

}
