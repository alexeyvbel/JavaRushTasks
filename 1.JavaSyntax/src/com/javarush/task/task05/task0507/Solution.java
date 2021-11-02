package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        float a=0, b=0;
        int i=0;
        while(b!=-1) {
            b = Float.parseFloat(reader.readLine());
            if (b != -1) {
                a = a + b;
                i = i + 1;
            }
        }
        System.out.println(a/i);
    }
}

