package com.javarush.task.task08.task0818;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("fio" + i, i * 100+100);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> i = map.entrySet().iterator();
        while((i.hasNext()))
        {
            Map.Entry<String, Integer> p = i.next();
            int b = p.getValue();
            if(b<500)
            {
                i.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}