package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();

        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] array=new int[20];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<array.length;i++)
            array[i]=Integer.parseInt(reader.readLine());
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max=-35652;

        for(int i=0;i<array.length;i++)
            max=max<array[i]?array[i]:max;
        return max;
    }
}
