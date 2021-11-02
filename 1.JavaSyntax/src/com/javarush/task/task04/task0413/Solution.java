package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] weekday={"понедельник","вторник","среда","четверг","пятница","суббота","воскресенье"};
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a;
        a=Integer.parseInt(reader.readLine());
        if(a<8 && a>0) System.out.println(weekday[a-1]);
        else System.out.println("такого дня недели не существует");
    }
}