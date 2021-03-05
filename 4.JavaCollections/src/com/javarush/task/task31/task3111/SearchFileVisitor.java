package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private ArrayList<Path> foundFiles;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length

        if()

        return super.visitFile(file, attrs);
    }

    public void setPartOfName(String amigo) {
        partOfName = amigo;
    }

    public void setPartOfContent(String programmer) {
        partOfContent = programmer;
    }

    public void setMinSize(int i) {
        minSize = i;
    }

    public void setMaxSize(int i) {
        maxSize = i;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }
}
