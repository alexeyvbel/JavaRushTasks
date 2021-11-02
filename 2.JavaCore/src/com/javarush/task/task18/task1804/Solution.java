package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
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

        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()
                ) {

            if (entry.getValue() == Collections.min(new ArrayList<>(hashMap.values())))
            {
                System.out.print(entry.getKey() + " ");
            }

        }
    }
}
