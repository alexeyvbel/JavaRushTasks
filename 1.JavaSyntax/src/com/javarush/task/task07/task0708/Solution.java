package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Solution.strings=new ArrayList<>();
        ArrayList<Integer> in=new ArrayList<Integer>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++) {
            Solution.strings.add(reader.readLine());
            in.add(Solution.strings.get(i).length());
        }

        for(int i=0;i<5;i++){
            if(Solution.strings.get(i).length()==Collections.max(in)) System.out.println(Solution.strings.get(i));
        }


    }
}