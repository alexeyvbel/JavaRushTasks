package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList mas=new ArrayList();
        //напишите тут ваш код
        for (int i=0;i<=4;i++){
            mas.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(mas);
        for(int i=0;i<=4;i++)
            System.out.println(mas.get(i));
    }
}
