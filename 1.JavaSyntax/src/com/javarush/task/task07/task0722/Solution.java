package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list=new ArrayList<>();
        String str="";
        for ( ;!str.contains("end"); ){
            str=reader.readLine();
            if (!str.contains("end"))
                list.add(str);
        }
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));

    }
}