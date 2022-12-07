package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses = new ArrayList<>();

    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public Hippodrome() {
    }

    public static void main(String[] args) {
        game = new Hippodrome();
        game.horses.add(new Horse("horse", 3, 0));
        game.horses.add(new Horse("horse2", 3, 0));
        game.horses.add(new Horse("horse3", 3, 0));
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
