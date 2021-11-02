package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int data;

        while (inputStream.available() > 0){

            data = inputStream.read();

            if (hashMap.containsKey(data)){

                hashMap.put(data,hashMap.get(data) + 1);

            } else {

                hashMap.put(data,1);

            }

        }

        inputStream.close();
        
        ArrayList arrayList = new ArrayList<>(hashMap.keySet());

        Collections.sort(arrayList);

        for (Iterator<Integer> text = arrayList.iterator(); text.hasNext() ; ) {

            System.out.print(text.next() + " ");

        }



    }
}
