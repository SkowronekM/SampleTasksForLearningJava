package com.example.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.Arrays;

public class JTableExample extends JFrame {
    public static void main(String[] args) {
        JTableExample frame = new JTableExample();

        String columns[] = {"Manufacturer", "Name", "Year", "Top speed"};
        String data[][] = {
                {"Ford", "T", "1920", "40"},
                {"Ford", "Mustang", "1970", "200"}
        };

        JTable jt = new JTable(data,columns);

        jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(jt); // do przewijania
        pane.setPreferredSize(new Dimension(300, 100));


        frame.add(pane,BorderLayout.CENTER);
        frame.pack();

        jt.setValueAt("35", 0, 3);
        System.out.println(jt.getValueAt(1, 1));
        System.out.println("Column count: " + jt.getColumnCount());
        System.out.println("Column name: " + jt.getColumnName(2));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
