package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        return  ((- new SimpleDateFormat("MMMM dd yyyy").parse("JANUARY 1 " + new SimpleDateFormat("yyyy").format(new SimpleDateFormat("MMMM dd yyyy").parse(date))).getTime() + new SimpleDateFormat("MMMM dd yyyy").parse(date).getTime())/(24*1000*3600)) % 2 == 0 ? true : false;
    }
}
