package com.example.swing;

import javax.swing.*;
import java.awt.*;

public class JDesktopPaneExample extends JFrame {
    public static void main(String[] args) {
        JDesktopPaneExample frame = new JDesktopPaneExample();

        JDesktopPane desktop = new JDesktopPane();
        frame.add(desktop, BorderLayout.CENTER);

        JInternalFrame internalFrame = new JInternalFrame(
                "Title 1",
                true,
                true,
                true
        );

        internalFrame.setBounds(10, 10, 150, 150);
        internalFrame.add(new JLabel("Label 1", JLabel.CENTER));

        internalFrame.setVisible(true);
        desktop.add(internalFrame);


        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // wysrodkowane
        frame.setVisible(true);
    }
}
