package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {

    public static void main(String[] args) throws IOException {


    }

    public static Planet thePlanet;

    static {

        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();

        if (string.contains(Sun.SUN)){
            Sun sun = Sun.getInstance();
            thePlanet = sun;
        } else
        if (string.contains(Sun.MOON)){
            Moon moon = Moon.getInstance();
            thePlanet = moon;
        } else
        if (string.contains(Sun.EARTH)){
            Earth earth = Earth.getInstance();
            thePlanet = earth;
        } else {
            thePlanet = null;
        }

    }
}
