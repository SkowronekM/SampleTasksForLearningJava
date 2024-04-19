package com.example.fileYT;

import java.io.File;

public class FileRead {
    public static void main(String[] args) {

        File file = new File("src/com/example/fileYT/message.txt");

        if (file.exists()) {
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        } else {
            System.out.println("That file doesn't exist :(");
        }

    }
}
