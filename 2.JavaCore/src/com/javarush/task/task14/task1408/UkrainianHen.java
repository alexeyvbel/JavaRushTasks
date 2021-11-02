package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country{

    public int N = 12;


    int getCountOfEggsPerMonth(){
        return N;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + N + " яиц в месяц.";
    }

}
