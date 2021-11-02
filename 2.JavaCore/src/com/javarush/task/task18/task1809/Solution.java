package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            String text = reader.readLine();

            list.add(text);

        }

        FileInputStream inputStream = new FileInputStream(list.get(0));

        FileOutputStream outputStream = new FileOutputStream(list.get(1));


        byte[] buffer = new byte[inputStream.available()];

        inputStream.read(buffer);

        for (int i = 0; i < buffer.length / 2; i++) {
            byte temp = buffer[i];
            buffer[i] = buffer[buffer.length - 1 - i];
            buffer[buffer.length - 1 - i] = temp;
        }

        outputStream.write(buffer);

        inputStream.close();
        outputStream.close();



    }
}
