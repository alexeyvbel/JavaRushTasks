package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if( this.age*this.strength*this.weight>=anotherCat.age*anotherCat.strength*anotherCat.weight)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        cat1.age=20;
        cat2.age=3;
        cat1.weight=5;
        cat2.weight=10;
        cat1.strength=10;
        cat2.strength=5;
        System.out.println(cat2.fight(cat1));
        System.out.println(cat1.fight(cat2));

    }
}
