package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Alexey",true,5);
        Human dauther = new Human("Anna", false,7);
        Human son2 = new Human("Matvei",true, 9);

        ArrayList<Human> child = new ArrayList<>();
        child.add(son1);
        child.add(dauther);
        child.add(son2);



        Human father = new Human("Alexey",true, 28);

        father.children.add(son1);
        father.children.add(dauther);
        father.children.add(son2);

        Human mother = new Human("Anna", false, 31);
        mother.children.add(son1);
        mother.children.add(dauther);
        mother.children.add(son2);

        Human grandfather1 = new Human("Vasya", true, 50);
        grandfather1.children.add(father);

        Human grandmother1 = new Human("Olga", false, 48);
        grandmother1.children.add(father);

        Human grandfather2 = new Human("Evgeniy", true, 70);
        grandfather2.children.add(mother);

        Human grandmother2 = new Human("Galina", false, 60);
        grandmother2.children.add(mother);

        System.out.println(son1.toString());
        System.out.println(dauther.toString());
        System.out.println(son2.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());

        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());



    }

    public static class Human  {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(Arrays.asList(children));
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
