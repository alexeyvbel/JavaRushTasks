package com.javarush.task.task16.task1633;

/* 
Отдебажим все на свете
Разобраться, что делает программа.

Почитать про UncaughtExceptionHandler - это важно.

Еще раз внимательно посмотреть программу.

Разобраться - продебажить - почему наш OurUncaughtExceptionHandler не срабатывает.

Исправить ошибку, т.е. все должно работать. :)

Ожидаемый результат в произвольном порядке:

Нить 1: My exception message

Нить 2: My exception message


Requirements:
1. Метод main должен создавать нить с параметрами: commonThread и "Нить 1".
2. Метод main должен создавать нить с параметрами: commonThread и "Нить 2".
3. Метод main должен запускать две созданные нити типа Thread.
4. Метод main должен прерывать две созданные нити типа Thread.
5. Программа с помощью метода uncaughtException класса OurUncaughtExceptionHandler должна вывести 2 сообщения.
6. Метод uncaughtException класса OurUncaughtExceptionHandler явно не вызывать.
7. Вывод программы должен содержать строки: "Нить 1: My exception message" и "Нить 2: My exception message".
*/

public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");

        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
