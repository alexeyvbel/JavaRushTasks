package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        int d=Integer.parseInt(reader.readLine());
        if (a==b && c==b && c==d) System.out.println(b); else
        if (a>=b && a>=c && a>=d) System.out.println(a); else
        if (a<=b && b>=c && b>=d) System.out.println(b); else
        if (c>=b && a<=c && c>=d) System.out.println(c); else
        if (d>=b && d>=c && a<=d) System.out.println(d);

    }
}
