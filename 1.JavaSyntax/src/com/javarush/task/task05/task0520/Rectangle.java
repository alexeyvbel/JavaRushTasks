package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;
    public Rectangle(int left, int top, int width, int height)
    {
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public Rectangle(int left, int top)
    {
        this.top=top;
        this.left=left;
        this.width=0;
        this.height=0;
    }
    public Rectangle(int left, int top, int width)
    {
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }
    public Rectangle()
    {
        this.top=1;
        this.left=1;
        this.width=1;
        this.height=1;
    }
    public static void main(String[] args) {

    }
}
