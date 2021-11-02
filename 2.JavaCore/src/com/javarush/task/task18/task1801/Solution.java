package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int max = 0;
        int data;

        while (inputStream.available() > 0){

            data = inputStream.read();

            if (max < data) max = data;

        }

        inputStream.close();
        System.out.println(max);
    }
}
