package com.jai;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        System.out.println(AllPaths("",maze,0,0));
        int[][] path = new int[maze.length][maze[0].length];
        AllPathsPrint("",maze,0,0,path,1);
    }

    static ArrayList<String> AllPaths(String p, boolean[][] maze, int r, int c) {
        // base condition
        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        maze[r][c] = false;

        if(r < maze.length-1){
            list.addAll(AllPaths(p + 'D',maze,r+1,c));
        }
        if(c < maze[0].length-1){
            list.addAll(AllPaths(p + 'R',maze,r,c+1));
        }

        if(r > 0){
            list.addAll(AllPaths(p + 'U',maze,r-1,c));
        }

        if(c > 0){
            list.addAll(AllPaths(p + 'L',maze,r,c-1));
        }
        // this line where execute when above function return its value
        // so before returning , remove all changes made by the function
        maze[r][c] = true; // Backtracking
        return list;
    }

    static void AllPathsPrint(String p,boolean[][] maze,int r,int c,int[][] path,int step) {
        // base condition
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            AllPathsPrint(p + 'D',maze,r+1,c,path,step+1);
        }
        if(c < maze[0].length-1){
            AllPathsPrint(p + 'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            AllPathsPrint(p + 'U',maze,r-1,c,path,step+1);
        }
        if(c>0){
            AllPathsPrint(p + 'L',maze,r,c-1,path,step+1);
        }

        // Backtracking
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
