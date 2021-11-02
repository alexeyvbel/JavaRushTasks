package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human[] humans=new Human[9];
         humans[0]=new Human("name1",true,40);
         humans[1]=new Human("name2",false,40);
         humans[2]=new Human("name3",true,50);
         humans[3]=new Human("name4",false,60);
         humans[4]=new Human("name5",true,30, humans[0], humans[1]);
         humans[5]=new Human("name6",false,30, humans[0], humans[1]);
         humans[6]=new Human("name7",true,10, humans[4], humans[5]);
         humans[7]=new Human("name8",false,12, humans[4], humans[5]);
         humans[8]=new Human("name9",true,15, humans[4], humans[5]);
        for(int i=0;i<9;i++)
        System.out.println(humans[i].toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Human father;
        Human mother;
        boolean sex;
        int age;

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















