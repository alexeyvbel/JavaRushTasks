package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b;


            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());

        if (a <= 0 || b <= 0 ) {
            throw new Exception();
        }

            int t;
            while (b != 0) {
                t = b;
                b = a % b;
                a = t;
            }
            System.out.println(a);




    }
}
