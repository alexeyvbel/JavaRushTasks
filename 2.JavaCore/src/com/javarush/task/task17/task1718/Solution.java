package com.javarush.task.task17.task1718;

/* 
Глажка
И снова быт...
Поставьте один synchronized, чтобы diana и igor гладили по очереди, ведь утюг всего один!

Подсказка:
использовать блокировку на уровне класса.


Requirements:
1. Класс Solution должен содержать public static класс Clothes.
2. Класс Solution должен содержать public static класс Iron.
3. Класс Solution должен содержать public static класс Person.
4. Класс Person должен быть нитью.
5. В методе run() класса Person должен быть synchronized блок.
6. Synchronized блок должен использовать блокировку на уровне класса.
*/

public class Solution {
    public static void main(String[] args) {
        Person diana = new Person("Diana");
        Person igor = new Person("Igor");
        diana.start();
        igor.start();
    }

    public static class Person extends Thread { //Человек

        public Person(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (Iron.class) {
                Iron iron = takeIron();
                Clothes clothes = takeClothes();
                ironing(iron, clothes);
                returnIron();
            }
        }

        protected Iron takeIron() {
            System.out.println("Taking an Iron");
            return new Iron();
        }

        protected Iron returnIron() {
            System.out.println("Returning the Iron");
            return new Iron();
        }

        protected Clothes takeClothes() {
            return new Clothes("T-shirt");
        }

        protected void ironing(Iron iron, Clothes clothes) {
            System.out.println(getName() + "'s ironing the " + clothes.name);
        }
    }

    public static class Iron {
    } //Утюг

    public static class Clothes {//Одежда
        String name;

        public Clothes(String name) {
            this.name = name;
        }
    }
}
