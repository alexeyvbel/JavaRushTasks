package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int size[] = {5, 2, 4, 7, 0};
        int[] massiv;
        for (int i = 0; i < size.length; i++)
        {
            int n;
            massiv = new int[size[i]];
            n = size[i];


            for (int j = 0; j < n; j++){
                massiv[j] = j;
            }
            arrayList.add(i,massiv);
        }
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
