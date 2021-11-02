package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        PersonScannerAdapter (Scanner fileScanner){
            this.fileScanner = fileScanner;
        }


        @Override
        public void close() {
            this.fileScanner.close();
        }

        @Override
        public Person read() throws ParseException {
            String[] string = this.fileScanner.nextLine().split(" ",4);
            return new Person(string[1],string[2],string[0], (new SimpleDateFormat("d M y", Locale.ENGLISH)).parse(string[3]));
        }
    }
}
