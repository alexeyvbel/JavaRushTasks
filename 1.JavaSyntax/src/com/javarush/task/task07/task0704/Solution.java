package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int in[]=new int[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<in.length; i++){
            in[i]=Integer.parseInt(reader.readLine());
        }


        for (int i=in.length-1;i>=0;i--)
            System.out.println(in[i]);
    }
}

