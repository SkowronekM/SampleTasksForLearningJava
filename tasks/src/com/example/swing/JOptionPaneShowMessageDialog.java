package com.example.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class JOptionPaneShowMessageDialog extends JFrame {
    public static void main(String[] args) {
        JOptionPaneShowMessageDialog frame = new JOptionPaneShowMessageDialog();

//        JOptionPane.showMessageDialog(frame, "Hello world", "Title", JOptionPane.PLAIN_MESSAGE);

        ImageIcon icon = new ImageIcon("files/donkey.jpg");

        JOptionPane.showMessageDialog(null, "<html><u>Hello world!</u></html>", "Strona tytułowa",
                JOptionPane.ERROR_MESSAGE, icon);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
    }
}
