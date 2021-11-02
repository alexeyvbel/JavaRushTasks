package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();

        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();


        while (fileReader.ready()){
            int rd = fileReader.read();

            stringBuilder.append((char)rd);

        }

        fileReader.close();


        Pattern pattern = Pattern.compile("(\\b|^)world(\\b|$)");
        Matcher matcher = pattern.matcher(new String(stringBuilder));

        while(matcher.find()){
            count++;
        }


        System.out.println(count);

    }
}
