package com.javarush.task.task12.task1227;

/* 
Fly, Run, Swim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public class Duck implements Run, Fly, Swim{

        @Override
        public void run() {

        }

        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements Run, Swim {
        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public class Toad implements Swim{
        @Override
        public void swim() {

        }
    }
}
