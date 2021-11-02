package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            String text = reader.readLine();

            list.add(text);

        }

        FileInputStream inputStream = new FileInputStream(list.get(0));

        FileOutputStream outputStream = new FileOutputStream(list.get(1));

        FileOutputStream outputStream1 = new FileOutputStream(list.get(2));

        byte[] buffer = new byte[inputStream.available()];

        int len = inputStream.available();
        int count;


        while (inputStream.available() > 0){

            count = inputStream.read(buffer);


            outputStream.write(buffer,0,count - len/2);


            outputStream1.write(buffer,(len%2 == 0 ? len/2 : len/2 + 1),count - (len%2 == 0 ? len/2 : len/2 + 1));

        }

        inputStream.close();
        outputStream.close();
        outputStream1.close();

    }
}
