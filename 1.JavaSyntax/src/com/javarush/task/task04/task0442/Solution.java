package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=0, b=0;
        for (;b!=-1;)
        {
            b=Integer.parseInt(reader.readLine());
            a=a+b;
        }
        System.out.println(a);
    }
}
