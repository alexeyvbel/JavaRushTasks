package com.javarush.task.task09.task0910;

import org.omg.CORBA.ExceptionList;

import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();
        try{
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }

        //напишите тут ваш код
    }
}