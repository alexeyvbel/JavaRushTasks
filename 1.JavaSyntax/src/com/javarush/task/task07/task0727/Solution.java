package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        int i=0;
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
            if (list.get(i).length()%2==0)
                list.set(i,list.get(i) + " " + list.get(i));
            else
                list.set(i,list.get(i) + " " + list.get(i) + " " + list.get(i));

            i++;
        }

        /*ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }*/

        for (i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
