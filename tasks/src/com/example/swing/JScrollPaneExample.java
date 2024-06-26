package com.example.swing;

import javax.swing.*;

public class JScrollPaneExample extends JFrame{
    public static void main(String[] args) {
        JScrollPaneExample frame = new JScrollPaneExample();

        JTextArea area = new JTextArea(20, 20);
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);


        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // wysrodkowane
        frame.setVisible(true);
    }
}
