package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        PrintStream printStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String string = outputStream.toString();

        System.setOut(printStream);

        System.out.println(string);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

        fileOutputStream.write(string.getBytes());

        fileOutputStream.close();

        reader.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

