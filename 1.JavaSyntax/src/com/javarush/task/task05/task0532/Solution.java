package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = -56362, N;

        N=Integer.parseInt(reader.readLine());

        for (int i=0;i<N;i++) {
            int num=Integer.parseInt(reader.readLine());
            maximum = maximum > num ? maximum : num;
        }
        //напишите тут ваш код

        System.out.println(maximum);
    }
}
