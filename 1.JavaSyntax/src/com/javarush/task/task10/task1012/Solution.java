package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < abcArray.length; i++){
            integers.add(i, 0);
        }


        for (int i = 0; i < 10; i++){
            for (int j = 0; j < list.get(i).length(); j++){
                String key = list.get(i).substring(j,j+1);
                if(alphabet.contains(key.charAt(0))){
                    integers.set(alphabet.indexOf(key.charAt(0)), integers.get(alphabet.indexOf(key.charAt(0))) + 1);
                }
            }
        }

        for (int i = 0; i < abcArray.length; i++){
            System.out.println(alphabet.get(i) + " " + integers.get(i));
        }
    }

}
