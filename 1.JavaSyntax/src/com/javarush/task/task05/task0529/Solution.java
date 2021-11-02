package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream instrm=System.in;
        Reader ins=new InputStreamReader(instrm);
        BufferedReader br=new BufferedReader(ins);
        String str="";
        int sum=0;
        while(!str.equals("сумма"))
        {
            str=br.readLine();
            if(!str.equals("сумма"))
                sum+=Integer.parseInt(str);
        }
        System.out.println(sum);
    }
}
