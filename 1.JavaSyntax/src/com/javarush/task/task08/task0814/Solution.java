package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i = 0; i < 20; i++) hashSet.add(i);
        return hashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator iterator=set.iterator();
        Integer num;
        while(iterator.hasNext()){
            num= (Integer) iterator.next();
            if (num>10)
                iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {


    }
}
