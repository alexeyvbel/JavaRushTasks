package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/aleksejbelanin/Documents/MY_Project/" + reader.readLine()));
        String text = "";
        while(!text.contains("exit")){
            text = reader.readLine();
            bufferedWriter.write(text + '\n');
        }
        bufferedWriter.close();
        reader.close();
    }
}
