package com.javarush.task.task06.task0606;

import java.io.*;

import static java.lang.Math.pow;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String str=reader.readLine();
        double num=Integer.parseInt(str);
        int n;
        for(int i=str.length()-1;i>=0;i--)
        {
            n=(int)(num/pow(10,i));
            if(n%2==0)
                even++;
            else
                odd++;
            num=num-n*pow(10,i);
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
