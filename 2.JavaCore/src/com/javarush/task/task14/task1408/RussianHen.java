package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {

    public int N = 100;

    int getCountOfEggsPerMonth(){
        return N;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + N + " яиц в месяц.";
    }
}
