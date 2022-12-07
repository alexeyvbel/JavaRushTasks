package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
Метод checkTelNumber должен проверять, является ли аргумент telNumber валидным номером телефона.

Критерии валидности:
1) если номер начинается с '+', то он содержит 12 цифр
2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
3) может содержать 1 пару скобок '(' и ')'
4) скобки (если они есть) внутри содержат четко 3 цифры
5) номер может содержать только цифры, '+', '(' и ')'
6) номер заканчивается на цифру

Примеры:
+380501234567 - true
+38(050)1234567 - true
(050)1234567 - true
0(501)234567 - true
+38)050(1234567 - false
+38(050)123-45-67 - false
050ххх4567 - false
050123456 - false
(0)501234567 - false


Requirements:
1. Метод checkTelNumber должен возвращать значение типа boolean.
2. Метод checkTelNumber должен быть публичным.
3. Метод checkTelNumber должен принимать один параметр типа String.
4. Метод checkTelNumber должен корректно проверять валидность номера телефона переданного ему в качестве параметра.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean checkTelNumber(String telNumber) {

        return (telNumber.matches("^\\+(\\d[\\-()]?){11}\\d$") || telNumber
                .matches("^[(\\d]-?(\\d[\\-)]?){8}\\d$"))
                && telNumber.matches("^(\\+)?(\\d)*(\\(\\d{3}\\))?(\\d+-?\\d+-?)?\\d+$");
    }

    public static void main(String[] args) {
        HashMap<String, Boolean> phones = new HashMap<>();
        phones.put("+380501234567", true);
        phones.put("+380501234567", true);
        phones.put("+38(050)1234567", true);
        phones.put("+38050123-45-67", true);
        phones.put("050123-4567", false);
        phones.put("+38)050(1234567", false);
        phones.put("+38(050)1-23-45-6-7", false);
        phones.put("050ххх4567", false);
        phones.put("050123456", false);
        phones.put("(0)501234567", false);

        for (Map.Entry<String, Boolean> pair : phones.entrySet()) {
//            System.out.println(pair.getKey());
            if (checkTelNumber(pair.getKey()) != pair.getValue())
                System.out.println("ERROR:Should be:" + pair.getValue() + " checkTelNumber:" + checkTelNumber(pair.getKey()) + " " + pair.getKey());
        }
    }
}
