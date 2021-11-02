package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            else
            {
                String family = reader.readLine();
                if (family.isEmpty()) break;
                    else addresses.put(city, family);
            }

        }

        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());


        String checkAddress = reader.readLine();

        System.out.println(addresses.get(checkAddress));
    }
}
