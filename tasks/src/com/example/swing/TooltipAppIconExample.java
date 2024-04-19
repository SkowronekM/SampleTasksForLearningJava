package com.example.swing;

import javax.swing.*;
import java.awt.*;

public class TooltipAppIconExample extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton b1 = new JButton("Click me!");
        b1.setToolTipText("Kliknij mnie!");
        Image icon = (new ImageIcon("files/donkey.jpg")).getImage();
        frame.setIconImage(icon);

        frame.setLayout(new FlowLayout());
        frame.add(b1);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // wysrodkowane
        frame.setVisible(true);
    }
}
