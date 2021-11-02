package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list=new ArrayList<>();
        int max=0, count=0;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int j=0;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            if (i>=1 && list.get(i-1) == list.get(i)) count++;
            else count=1;
            max = count > max ? count : max;
        }

        System.out.println(max);

    }
}