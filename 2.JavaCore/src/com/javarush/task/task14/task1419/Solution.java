package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        }
        catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        exceptions.add( new NumberFormatException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new NegativeArraySizeException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new UnsupportedOperationException());
        exceptions.add(new EmptyStackException());
        exceptions.add(new RuntimeException());


    }
}
