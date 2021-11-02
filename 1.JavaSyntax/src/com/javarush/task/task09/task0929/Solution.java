package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = null;
        String destinationFileName = null;
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;
        int data = 0;



        try
        {
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);

            destinationFileName = reader.readLine();
            fileOutputStream = getOutputStream(destinationFileName);

            while (fileInputStream.available() > 0 && fileInputStream != null) {
                data = fileInputStream.read();
                fileOutputStream.write(data);

            }



        }
        catch (IOException e){
            System.out.println("Файл не существует");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);

            destinationFileName = reader.readLine();
            fileOutputStream = getOutputStream(destinationFileName);

            while (fileInputStream.available() > 0) {
                data = fileInputStream.read();
                fileOutputStream.write(data);

            }

        }






        fileOutputStream.close();
        fileInputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

