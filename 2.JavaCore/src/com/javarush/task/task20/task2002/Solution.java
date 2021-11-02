package com.javarush.task.task20.task2002;

import javax.xml.crypto.Data;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            String yourFile = "/Users/aleksejbelanin/Documents/rez";
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Alexey");
            user.setLastName("Belyanin");
            user.setBirthDate(new Date());
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            loadedObject.equals(user);
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            for(User user:users){
                writer.write(user.getFirstName()==null? "null" :user.getFirstName());                              writer.write(";");
                writer.write(user.getLastName()==null? "null" :user.getLastName());                                writer.write(";");
                writer.write(user.getBirthDate()==null? "null" :Long.toString(user.getBirthDate().getTime()));     writer.write(";");
                writer.write(Boolean.toString(user.isMale()));                                                     writer.write(";");
                writer.write(user.getCountry()==null? "null" :user.getCountry().getDisplayName());               writer.write("\n");
            }
            writer.flush();

        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String currentLine;
            User currentUser;
            while (reader.ready()){
                currentLine = reader.readLine();
                String[] str = currentLine.split(";");
                currentUser = new User();
                if(!str[0].equals("null")) currentUser.setFirstName(str[0]);
                if(!str[1].equals("null")) currentUser.setLastName(str[1]);
                if(!str[2].equals("null")) currentUser.setBirthDate(new Date(Long.parseLong(str[2])));
                currentUser.setMale(Boolean.parseBoolean(str[3]));
                switch (str[4]){
                    case "Ukraine": currentUser.setCountry(User.Country.UKRAINE); break;
                    case "Russia":  currentUser.setCountry(User.Country.RUSSIA);  break;
                    case "Other":   currentUser.setCountry(User.Country.OTHER);   break;
                }
                this.users.add(currentUser);
            }


            //System.out.println(stringBuilder);

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
