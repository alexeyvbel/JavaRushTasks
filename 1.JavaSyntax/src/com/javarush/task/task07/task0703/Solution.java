package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String s[]=new String[10];
        int in[]=new int[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<s.length;i++) {
            s[i]=reader.readLine();
            in[i]=s[i].length();
        }

        for(int i=0;i<in.length;i++)
            System.out.println(in[i]);
    }
}
