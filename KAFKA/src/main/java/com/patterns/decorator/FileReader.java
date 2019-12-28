package com.patterns.decorator;

public class FileReader implements Reader {

    private String filePath;

    public FileReader(String path){
        this.filePath = path;
    }

    public void read() {
        System.out.println("ReadingFile form " + this.filePath);
    }
}
