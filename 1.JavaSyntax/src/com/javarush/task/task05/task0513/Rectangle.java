package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    public int top, left, width, height;
    public void initialize(int top, int left, int width, int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public void initialize(int top, int left){
        this.top=top;
        this.left=left;
        this.width=0;
        this.height=0;
    }
    public void initialize(int top, int left, int width){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }
    public void initialize(){
        this.top=1;
        this.left=2;
        this.width=3;
        this.height=4;
    }
    public static void main(String[] args) {

    }
}
