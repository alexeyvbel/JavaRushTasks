package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int mas[]=new int[20];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<mas.length;i++)
            mas[i]=Integer.parseInt(reader.readLine());

        int m1[]=new int[10];
        int m2[]=new int[10];
        for (int i=0;i<mas.length/2;i++){
            m1[i]=mas[i];
            m2[i]=mas[i+10];
        }

        for (int i=0;i<m2.length;i++)
            System.out.println(m2[i]);
    }
}
