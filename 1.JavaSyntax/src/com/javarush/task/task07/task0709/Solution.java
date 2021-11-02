package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<String>();
        ArrayList<Integer> in=new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            list.add(reader.readLine());
            in.add(list.get(i).length());
        }

        for (int i=0;i<5;i++)
            if(list.get(i).length()== Collections.min(in)) System.out.println(list.get(i));
    }
}
