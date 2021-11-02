package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);
        for (int i=0;i<result.size();i++)
            System.out.println(result.get(i));

        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        int len=list.size();
        for (int i=0;i<len;i++){
            list.add(2*i+1,list.get(i*2));
        }
        return list;
    }
}
