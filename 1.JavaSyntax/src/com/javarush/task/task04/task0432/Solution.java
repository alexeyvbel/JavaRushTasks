package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String b=reader.readLine();
        int a=Integer.parseInt(reader.readLine());

        while(a>0)
        {
            System.out.println(b);
            a--;
        }

    }
}
