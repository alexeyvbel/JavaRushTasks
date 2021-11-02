package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream printStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String rezult = outputStream.toString().replaceFirst("\\n","");


        String[] string = rezult.split(" ");

        switch (string[1]){
            case "+":
                rezult = rezult + String.valueOf(Integer.parseInt(string[0]) + Integer.parseInt(string[2]));
                break;
            case "-":
                rezult = rezult + String.valueOf(Integer.parseInt(string[0]) - Integer.parseInt(string[2]));
                break;
            case "*":
                rezult = rezult + String.valueOf(Integer.parseInt(string[0]) * Integer.parseInt(string[2]));
                break;
        }

        System.setOut(printStream);

        System.out.println(rezult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

