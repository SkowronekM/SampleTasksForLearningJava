package com.example.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBarExample extends JFrame {
    public static void main(String[] args) {
        JScrollBarExample frame = new JScrollBarExample();

        JScrollBar scroll1 = new JScrollBar(); // pionowy
//        JScrollBar scroll1 = new JScrollBar(Adjustable.HORIZONTAL); // -> poziomy
        scroll1.setValue(20);
        scroll1.setMinimum(0);
        scroll1.setMaximum(100);
        scroll1.setPreferredSize(new Dimension(35, 170)); // zmiana wymiarów paska

        scroll1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("Scroll value: " + e.getValue());
            }
        });

        frame.add(scroll1);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
