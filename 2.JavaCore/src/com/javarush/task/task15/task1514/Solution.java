package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();


    static {
        labels.put(1.0,"Leon");
        labels.put(1.1,"Birds");
        labels.put(1.2,"Dog");
        labels.put(1.3,"Cat");
        labels.put(1.4,"Frog");
    }

    public static void main(String[] args) {



        System.out.println(labels);
    }
}
