package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        String sage=reader.readLine();
        int nage=Integer.parseInt(sage);
        System.out.println(name + " захватит мир через " + nage + " лет. Му-ха-ха!");
    }
}
