package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        String cons;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (isNumber(array[i]) && isNumber(array[j])) {
                        if (Integer.parseInt(array[j]) < Integer.parseInt(array[i])) {
                            cons = array[i];
                            array[i] = array[j];
                            array[j] = cons;
                        }
                    }


                    if (!isNumber(array[i]) && !isNumber(array[j])) {
                        if (isGreaterThan(array[j], array[i])) {
                            cons = array[j];
                            array[j] = array[i];
                            array[i] = cons;
                        }
                    }

                }
            }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
