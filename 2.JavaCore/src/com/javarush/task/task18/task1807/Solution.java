package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int count = 0;

        while (inputStream.available() > 0){

           if (inputStream.read() == (int)',') count++;
        }

        inputStream.close();
        System.out.println(count);

    }
}
