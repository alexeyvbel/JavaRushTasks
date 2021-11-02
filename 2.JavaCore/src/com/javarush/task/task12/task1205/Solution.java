package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        String str = o.getClass().toString().substring(o.getClass().toString().indexOf("$")+1,o.getClass().toString().length());
        switch (str) {
            case "Cow" :
                str = "Корова";
                break;
            case "Dog" :
                str = "Собака";
                break;
            case "Whale" :
                str = "Кит";
                break;
                default:
                    str = "Неизвестное животное";
                    break;
        }

        return str;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
