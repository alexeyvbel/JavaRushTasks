package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        //::CODE:
        if(abs(10-a)<abs(10-b)) System.out.println(a);
        if(abs(10-a)>abs(10-b)) System.out.println(b);
        if(abs(10-a)==abs(10-b)) System.out.println(a);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}