package com.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Исправить ошибки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("/Users/aleksejbelanin/Downloads/JavaRushTasks/JavaRushTasks/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("/Users/aleksejbelanin/Downloads/JavaRushTasks/JavaRushTasks/result.txt");

        byte[] buffer = new byte[1000];
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
