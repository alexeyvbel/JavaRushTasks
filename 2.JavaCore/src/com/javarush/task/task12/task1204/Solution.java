package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение

        String str = o.getClass().toString().substring(o.getClass().toString().indexOf("$")+1,o.getClass().toString().length());
        switch (str) {
            case "Cat" :
                str = "Кошка";
                break;
            case "Dog" :
                str = "Собака";
                break;
            case "Bird" :
                str = "Птица";
                break;
            case "Lamp" :
                str = "Лампа";
                break;
        }

        System.out.println(str);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
