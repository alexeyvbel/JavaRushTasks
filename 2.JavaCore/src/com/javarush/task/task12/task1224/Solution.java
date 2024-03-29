package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String text = null;

        if(o instanceof Cat){
            text = "Кот";
        } else if(o instanceof Tiger){
            text = "Тигр";
        } else if(o instanceof Lion){
            text = "Лев";
        } else if(o instanceof Bull){
            text = "Бык";
        } else if(o instanceof Pig){
            text = "Свинья";
        } else {
            text = "Животное";
        }

        return text;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
