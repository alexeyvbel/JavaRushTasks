package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> listmain=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> listother=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<20; i++)
            listmain.add(Integer.parseInt(reader.readLine()));

        for(int i=0;i<20;i++) {
            if (listmain.get(i) % 3 == 0) list3.add(listmain.get(i));
            if (listmain.get(i) % 2 == 0) list2.add(listmain.get(i));
            if (listmain.get(i) % 3 != 0 && listmain.get(i) % 2 != 0) listother.add(listmain.get(i));
        }

        printList(list3);
        printList(list2);
        printList(listother);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for(int i=0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
