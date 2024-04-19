package com.example.swing;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

public class JFileChooserExample {
    public static void main(String[] args) {

        JFileChooser jFileChooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Files", "mp4", "dat", "txt", "jpg");

        jFileChooser.addChoosableFileFilter(filter);

        int result = jFileChooser.showOpenDialog(null);

        switch (result) {
            case JFileChooser.APPROVE_OPTION:
                File file = jFileChooser.getSelectedFile();
                System.out.println(file.getAbsolutePath());
                break;
            case JFileChooser.CANCEL_OPTION:
                System.out.println("JFileChooser cancel!");
                break;
            case JFileChooser.ERROR_OPTION:
                System.out.println("JFileChooser error!");
                break;
        }

    }
}
