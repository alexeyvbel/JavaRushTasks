package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int id = 1;
        String name = "0";
        HashMap<String, Integer> map = new HashMap<>();

        try {
            while (!name.isEmpty()) {
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                    map.put(name, id);

            }
        }
        catch (NumberFormatException e){

        }


        for (Map.Entry<String, Integer> pair : map.entrySet())
            System.out.println( pair.getValue() + " " + pair.getKey());
    }
}
