package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/* 
Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Использовать StringBuilder.
Кодировка файла - UTF-8.

Пример содержимого файла
рот тор торт о
о тот тот тот

Вывод:
рот тор
о о
тот тот


Requirements:
1. Метод main должен считывать имя файла с клавиатуры.
2. В методе main должен быть использован StringBuilder.
3. В классе Solution должен содержаться вложенный класс Pair с методами equals, hashCode и toString. Удалять или изменять эти методы нельзя.
4. В классе Pair должен быть объявлен конструктор без параметров (или конструктор по умолчанию).
5. Список result должен быть заполнен корректными парами согласно условию задачи.
*/

public class Solution {
    public static List<Pair> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {fileName = reader.readLine();}

        String content = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        List<String> words = new ArrayList<>(Arrays.asList(content.split("\\s")));

        List<String> wordsReverse = new ArrayList<>(words);
        for (int j = 0; j < words.size(); j++) {
            for (int i = 0; i < wordsReverse.size(); i++) {
                String reverseWord = (new StringBuilder(wordsReverse.get(i)).reverse()).toString();
                if (i != j && words.get(j).equals(reverseWord)){
                    Pair pair = new Pair();
                    pair.first = words.get(j);
                    pair.second = wordsReverse.get(i);
                    result.add(pair);
                    wordsReverse.remove(i);
                    words.remove(i);
                    wordsReverse.remove(j);
                    words.remove(j);
                    i = i - 2;
                }
            }
        }

        result.stream().forEach(
                s->
                        System.out.println(s)
        );
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
