package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
        bufferedReader.close();

        while (reader.ready()){
            writer.write(reader.readLine().replaceAll("[^\\w\\d\\s]",""));
        }
        reader.close();
        writer.close();
    }
}
