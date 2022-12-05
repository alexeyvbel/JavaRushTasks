package com.javarush.task.task21.task2103;

/* 
Все гениальное - просто!
Упростить. Переменные не переименовывать, комментарии не оставлять.


Requirements:
1. Метод calculate должен быть статическим.
2. Метод calculate должен возвращать значение типа boolean.
3. Метод calculate должен принимать четыре параметра типа boolean.
4. Метод calculate должен быть максимально упрощен(поведение должно остаться прежним).


0 0 0 1     1 0 0 0
0 0 1 1     0 1 1 1
0 0 1 0     0 1 1 0
0 1 0 0     0 0 1 1
0 1 0 1

*/

public class Solution {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
        return c;
    }

    public static void main(String[] args) {

    }
}
