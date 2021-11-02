package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch (args[0]){
            case "-c":
                if (args[2].equals("м")){
                    allPeople.add(Person.createMale(args[1],(new SimpleDateFormat("dd/MM/yyyy")).parse(args[3])));
                }
                if (args[2].equals("ж")){
                    allPeople.add(Person.createFemale(args[1],(new SimpleDateFormat("dd/MM/yyyy")).parse(args[3])));
                }
                System.out.println(allPeople.size()-1);
                break;
            case "-u":
                if (args[3].equals("м")){
                    allPeople.get(new Integer(args[1])).setSex(Sex.MALE);
                }
                if (args[3].equals("ж")){
                    allPeople.get(new Integer(args[1])).setSex(Sex.FEMALE);
                }
                allPeople.get(new Integer(args[1])).setName(args[2]);
                allPeople.get(new Integer(args[1])).setBirthDate((new SimpleDateFormat("dd/MM/yyyy")).parse(args[4]));
                break;
            case "-d":
                allPeople.get(new Integer(args[1])).setName(null);
                allPeople.get(new Integer(args[1])).setSex(null);
                allPeople.get(new Integer(args[1])).setBirthDate(null);
                break;
            case "-i":
                System.out.print(allPeople.get(new Integer(args[1])).getName() + " " + (allPeople.get(new Integer(args[1])).getSex().name().equals("MALE")?"м":"ж") + " " + (new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH)).format(allPeople.get(new Integer(args[1])).getBirthDate()));
                break;
        }

    }

}
