package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet hashSet=new HashSet();
        for (int i = 0; i < 20; i++) {
            hashSet.add("Л" + i);
        }
        return hashSet;

    }

    public static void main(String[] args) {

    }
}
