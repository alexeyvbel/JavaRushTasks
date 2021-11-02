package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map=new HashMap<>();
        for (int i = 0; i <10 ; i++) map.put("LastName"+i, "Name" + i%2);
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код

        HashMap<String, String> copy=new HashMap<>(map);
        for (Map.Entry<String, String> m : copy.entrySet()){
            String str=copy.get(m.getKey());
            for (Map.Entry<String, String> m2 : copy.entrySet())
                if (str==m2.getValue() && m.getKey()!=m2.getKey())
                    removeItemFromMapByValue(map,m2.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
