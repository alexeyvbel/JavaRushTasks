package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a) {
        //::CODE:
        if(50<a && a<100) System.out.println("Число " + a + " содержится в интервале.");
        else System.out.println("Число " + a + " не содержится в интервале.");
    }
}