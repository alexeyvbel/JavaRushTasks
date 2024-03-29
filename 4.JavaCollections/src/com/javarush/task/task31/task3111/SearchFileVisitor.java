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
    private List<Path> foundFiles;

    SearchFileVisitor () {
        this.foundFiles = new ArrayList<>();
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length

        this.foundFiles = new ArrayList<>();

        boolean isPartOfName = false;
        if (partOfName==null || file.getFileName().toString().contains(partOfName))
            isPartOfName = true;

        String cont = new String(Files.readAllBytes(file));
        boolean isPartOfContent = false;
        if (partOfContent == null || cont.contains(partOfContent))
            isPartOfContent = true;

        boolean isMaxSize = false;
        if (maxSize == 0 || content.length < maxSize)
            isMaxSize = true;

        boolean isMinSize = false;
        if (minSize == 0 || content.length > minSize)
            isMinSize = true;

        if (isPartOfName && isPartOfContent && isMaxSize && isMinSize)
            foundFiles.add(file);

        return FileVisitResult.CONTINUE;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {

        return this.foundFiles;
    }
}
