package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

import java.io.CharConversionException;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String s = null;
        try{
            String m = s.toLowerCase();
        }
        catch (NullPointerException e){
            System.out.println(NullPointerException.class);
        }

        //напишите тут ваш код
    }
}
