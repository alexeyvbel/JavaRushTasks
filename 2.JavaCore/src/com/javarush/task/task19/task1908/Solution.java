package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.awt.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));

        reader.close();

        String str = fileReader.readLine();
        fileReader.close();

        String[] list = str.split("\\s");

        for (int i = 0; i < str.split("\\s").length; i++){
            if (list[i].matches("\\d|(\\d+\\d)")){
                if(i > 0) fileWriter.write(" ");
                fileWriter.write(list[i]);
            }

        }

        fileWriter.close();

    }
}
