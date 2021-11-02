package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1=new Man("name1",1,"address1");
        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        Man man2=new Man("name2",2,"address2");
        System.out.println(man2.name+" "+man2.age+" "+man2.address);

        Woman woman1=new Woman("name1",1,"address1");
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        Woman woman2=new Woman("name2",2,"address2");
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);
    }

    //напишите тут ваш код
    public static class Man{
        public String name;
        public int age;
        public String address;
        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public Man(String name, int age){
            this.name=name;
            this.age=age;
        }
        public Man(String name){
            this.name=name;
        }
    }

    public static class Woman{
        public String name;
        public int age;
        public String address;
        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public Woman(String name, int age){
            this.name=name;
            this.age=age;
        }
        public Woman(String name){
            this.name=name;
        }
    }
}
