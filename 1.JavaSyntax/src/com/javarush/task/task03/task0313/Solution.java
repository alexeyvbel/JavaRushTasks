package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

import java.net.SocketPermission;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String s[]={"Мама", "Мыла", "Раму"};
        System.out.println(s[0]+s[1]+s[2]);
        System.out.println(s[0]+s[2]+s[1]);
        System.out.println(s[1]+s[0]+s[2]);
        System.out.println(s[2]+s[1]+s[0]);
        System.out.println(s[2]+s[0]+s[1]);
        System.out.println(s[1]+s[2]+s[0]);
    }
}
