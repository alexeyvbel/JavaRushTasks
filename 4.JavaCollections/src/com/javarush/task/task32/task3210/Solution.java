package com.javarush.task.task32.task3210;


import java.io.IOException;
import java.io.RandomAccessFile;

/*
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        long number = Integer.parseInt(args[1]);
        String text = args[2];

        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName,"rw");
        randomAccessFile.seek(number);
        byte[] b = new byte[text.length()];
        randomAccessFile.read(b, 0,b.length);
        String readText = new String(b);
        String rezult = readText.equals(text) ? "true" : "false";
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.write(rezult.getBytes());
        randomAccessFile.close();
    }
}
