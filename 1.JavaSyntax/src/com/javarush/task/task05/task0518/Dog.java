package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    //напишите тут ваш код
    private String name=null;
    private int height=0;
    private String color=null;
    public Dog(String name)
    {
        this.name=name;
        this.height=9;
        this.color="red";
    }
    public Dog(String name, int height)
    {
        this.name=name;
        this.height=height;
        this.color="red";
    }
    public Dog(String name, int height, String color)
    {
        this.name=name;
        this.height=height;
        this.color=color;
    }
    public static void main(String[] args) {

    }
}
