package com.example.fileYT;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("src/com/example/fileYT/poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere");
            writer.append("");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
