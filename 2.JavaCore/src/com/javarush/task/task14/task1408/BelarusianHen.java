package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country{

    public int N = 14;


    int getCountOfEggsPerMonth(){
        return N;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + N + " яиц в месяц.";
    }
}
