package com.javarush.task.task13.task1318;

import java.io.*;


/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String url = bufferedReader.readLine();
        bufferedReader.close();

        InputStream inputStream = new FileInputStream(url);

        while (inputStream.available() > 0)
        {
            System.out.print((char) inputStream.read());
        }

        inputStream.close();
    }
}