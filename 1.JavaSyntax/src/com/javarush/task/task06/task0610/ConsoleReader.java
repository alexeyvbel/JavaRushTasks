package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String string=reader.readLine();
        return string;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int rint=Integer.parseInt(reader.readLine());
        return rint;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Double rdouble=Double.parseDouble(reader.readLine());
        return rdouble;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Boolean rbool=Boolean.parseBoolean(reader.readLine());
        return rbool;

    }

    public static void main(String[] args) {

    }
}
