package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name=null;
    private int age=0;
    private int weight=0;
    private String address=null;
    private String color=null;
    public Cat(String name)
    {
        this.name=name;
        this.age=1;
        this.weight=1;
        this.color= "blue";
    }
    public Cat(String name, int weight, int age)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color= "blue";
    }
    public Cat(String name, int age)
    {
        this.name=name;
        this.age=age;
        this.weight=1;
        this.color= "blue";
    }
    public Cat(int weight, String color)
    {
        this.age=1;
        this.weight=weight;
        this.color=color;
    }
    public Cat(int weight, String color, String address)
    {
        this.age=1;
        this.weight=weight;
        this.color=color;
        this.address=address;
    }
    public static void main(String[] args) {

    }
}
