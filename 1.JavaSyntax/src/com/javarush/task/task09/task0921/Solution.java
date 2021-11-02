package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            while(true){
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                arrayList.add(Integer.parseInt(reader.readLine()));

            }
        }
        catch (IOException e){

        }
        catch (NumberFormatException e){
            for (int i = 0; i < arrayList.size(); i++)
                System.out.println(arrayList.get(i));
        }

    }
}
