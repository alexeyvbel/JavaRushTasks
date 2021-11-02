package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>();
        int flag=0, index=0;
        for(int i=0;i<10;i++){
            list.add(reader.readLine());
            if(i>0 && list.get(i-1).length()>list.get(i).length() && flag==0){
                flag=1;
                index=i;
            }
        }
        if(flag==1) System.out.println(index);
    }
}

