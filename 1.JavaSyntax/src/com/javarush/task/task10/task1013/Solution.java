package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private int age;
        private String sex;
        private String Name;
        private String Sername;
        private String Status;
        private boolean child;

        public Human(String sex, String Name){
            age = 0;
            this.sex = sex;
            this.Name = Name;
            Sername = "Belyanin";
            Status = "Married";
            child = true;
        }

        public Human(int age){
            this.age = age;
            sex = "man";
            Name = "Alex";
            Sername = "Belyanin";
            Status = "Married";
            child = true;
        }

        public Human(int age, String sex){
            this.age = age;
            this.sex = sex;
            Name = "Alex";
            Sername = "Belyanin";
            Status = "Married";
            child = true;
        }

        public Human(int age, String sex, String Name){
            this.age = age;
            this.sex = sex;
            this.Name = Name;
            Sername = "Belyanin";
            Status = "Married";
            child = true;
        }

        public Human(int age, String sex, String Name, String Sername){
            this.age = age;
            this.sex = sex;
            this.Name = Name;
            this.Sername = Sername;
            Status = "Married";
            child = true;
        }

        public Human(int age, String sex, String Name, String Sername, String Status){
            this.age = age;
            this.sex = sex;
            this.Name = Name;
            this.Sername = Sername;
            this.Status = Status;
            child = true;
        }

        public Human(int age, String sex, String Name, String Sername, String Status, boolean child){
            this.age = age;
            this.sex = sex;
            this.Name = Name;
            this.Sername = Sername;
            this.Status = Status;
            this.child = child;
        }

        public Human(int age, String sex, String Name, String Sername, boolean child){
            this.age = age;
            this.sex = sex;
            this.Name = Name;
            this.Sername = Sername;
            this.Status = "married";
            this.child = child;
        }

        public Human(String sex, String Name, String Status, boolean child){
            age = 28;
            this.sex = sex;
            this.Name = Name;
            Sername = "Belaynin";
            this.Status = Status;
            this.child = child;
        }

        public Human(String sex, String Name, String Status){
            age = 28;
            this.sex = sex;
            this.Name = Name;
            Sername = "Belaynin";
            this.Status = Status;
            this.child = false;
        }

    }
}
