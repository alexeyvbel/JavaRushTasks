package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {

    public int N = 10;


    int getCountOfEggsPerMonth(){
        return N;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + N + " яиц в месяц.";
    }

}
