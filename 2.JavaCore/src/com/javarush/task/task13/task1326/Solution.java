package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        DataInputStream inputStream = new DataInputStream(new FileInputStream(bufferedReader.readLine()));


        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        ArrayList<Integer> arrayList = new ArrayList<>();

        String string;

        while ((string = bufferedReader.readLine()) != null){

           // System.out.println(string);
           // /Users/aleksejbelanin/Documents/MY_Project/text.txt System.out.println(stringBuilder);

            if ((Integer.parseInt(string)) % 2 == 0) arrayList.add(Integer.parseInt(string));

        }

        bufferedReader.close();
        inputStream.close();

        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }


    }
}
