package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со словами, разделенными пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1, abc3d или 564.
Закрыть потоки.


Requirements:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна записывать во второй файл все слова из первого файла которые содержат цифры (используй FileWriter).
5. Поток записи в файл (FileWriter) должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter printWriter = new BufferedWriter(new FileWriter(args[1]));

        while (fileReader.ready()){
            String line =fileReader.readLine();
            String[] words = line.split(" ");
            for (String word : words)
                if (!word.matches("^\\D*$"))
                    printWriter.write(word + " ");
        }
        fileReader.close();
        printWriter.close();
    }
}
