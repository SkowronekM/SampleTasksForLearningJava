package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelExample extends JFrame {
    public static void main(String[] args) {
        JPanelExample frame = new JPanelExample();

        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.add(new JLabel("Label"));
        panel.add(new JButton("Click me!"));
        panel.setPreferredSize(new Dimension(150, 150));

        frame.add(panel);


        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
