package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Tima",new Cat("Tima"));
        cats.put("Marc",new Cat("Marc"));
        cats.put("Anton",new Cat("Anton"));
        cats.put("Gosha",new Cat("Gosha"));
        cats.put("Roma",new Cat("Roma"));
        cats.put("Kesha",new Cat("Kesha"));
        cats.put("Tren",new Cat("Tren"));
        cats.put("Sos",new Cat("Sos"));
        cats.put("Rom",new Cat("Rom"));
        cats.put("Pol",new Cat("Pol"));
        return cats;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet hashSet = new HashSet(map.values());
        return hashSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
