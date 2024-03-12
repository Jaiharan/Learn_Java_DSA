package com.jai;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//    path("",3,3);
//        System.out.println(pathrRet("",3,3));
//        System.out.println(pathrRetDiagonal("",3,3));
        boolean[][] maze = {
                        {true,true,true},
                        {true,false,true},
                        {true,true,true}
        };
        pathRestriction("",maze,0,0);
    }

    static int count(int r,int c) {
        // base condition
        if(c == 1 || r == 1) {
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }

    static void path(String p,int r,int c) {
        // base condition
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + 'D',r-1,c);
        }
        if(c > 1){
            path(p + 'R',r,c-1);
        }
    }

    static ArrayList<String> pathrRet(String p, int r, int c) {
        // base condition
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(pathrRet(p + 'D',r-1,c));
        }
        if(c > 1){
            list.addAll(pathrRet(p + 'R',r,c-1));
        }
        return list;
    }

    static ArrayList<String> pathrRetDiagonal(String p, int r, int c) {
        // base condition
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1) {
            list.addAll(pathrRetDiagonal(p + 'D',r-1,c-1));
        }
        if(r > 1){
            list.addAll(pathrRetDiagonal(p + 'V',r-1,c));
        }
        if(c > 1){
            list.addAll(pathrRetDiagonal(p + 'H',r,c-1));
        }
        return list;
    }

    static void pathRestriction(String p,boolean[][] maze,int r,int c) {
        // base condition
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1){
            pathRestriction(p + 'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            pathRestriction(p + 'R',maze,r,c+1);
        }
    }
}
