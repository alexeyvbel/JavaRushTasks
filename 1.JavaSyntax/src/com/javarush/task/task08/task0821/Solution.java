package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> people = new HashMap<>();
        String [] name = {"Willy", "John", "Sam", "Scott", "Alex"};
        String[] surname = {"Fridman", "Rabinovich", "Katz", "Schulman", "Khoen"};
        for (int i = 0 ; i < 10; i++) {
            people.put(name[(int) (Math.random() * 5)],surname[(int) Math.random() * 5]);
        }

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
