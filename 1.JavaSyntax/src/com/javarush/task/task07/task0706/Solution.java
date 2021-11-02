package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int in[]=new int[15];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int sum1=0, sum2=0;
        for(int i=0;i<in.length;i++) {
            in[i] = Integer.parseInt(reader.readLine());
            if(i==0 || i%2==0)
                sum1+=in[i];
            else
                sum2+=in[i];
        }

        if(sum1>sum2) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
