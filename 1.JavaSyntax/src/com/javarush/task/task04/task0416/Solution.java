package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        float a=Float.parseFloat(reader.readLine());
        if((a-(int)(a/5)*5)/3<1)
            System.out.println("зелёный");
        if((a-(int)(a/5)*5)/3>=1 && (a-(int)(a/5)*5)/4<1)
            System.out.println("желтый");
        if((a-(int)(a/5)*5)/4>=1)
            System.out.println("красный");
    }
}