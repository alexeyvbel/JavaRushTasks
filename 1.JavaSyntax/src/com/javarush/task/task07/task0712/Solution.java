package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int min = 0;
        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
            if(i > 0){
                max = list.get(i).length() > list.get(max).length() ? i : max;
                min = list.get(i).length() < list.get(min).length() ? i : min;
            }
        }
        String s = min < max ? list.get(min) : list.get(max);
        System.out.println(s);

    }
}
