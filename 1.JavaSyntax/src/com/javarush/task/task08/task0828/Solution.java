package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Map<String, Integer> month = new HashMap<String, Integer>();
        for (int i = 1; i <= 12 ; i++)
            month.put(Month.of(i).name(),i);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readmonth;

        readmonth = reader.readLine();

        System.out.println(readmonth + " is the " + (month.get(readmonth.toUpperCase())).toString().toUpperCase() + " month");

    }
}
