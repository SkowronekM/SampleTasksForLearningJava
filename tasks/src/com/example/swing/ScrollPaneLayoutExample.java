package com.example.swing;

import javax.swing.*;

public class ScrollPaneLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel label = new JLabel(new ImageIcon("files/donkey.jpg"));
        JScrollPane pane = new JScrollPane(label);

        frame.add(pane);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // wysrodkowane
        frame.setVisible(true);
    }
}
