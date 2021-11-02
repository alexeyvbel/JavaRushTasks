package com.javarush.task.task08.task0816;

import java.time.Month;
import java.time.Year;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        for (int i = 0; i < 10; i++) {
            map.put("Name" + i, new Date(Month.of(i+1) + " " + (i+1) + " " + 1980));
        }

        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, Date>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            int i=iterator.next().getValue().getMonth()+1;
            if (i>=6 && i<=8)
                iterator.remove();
        }

    }

    public static void main(String[] args) {
        createMap();
    }
}
