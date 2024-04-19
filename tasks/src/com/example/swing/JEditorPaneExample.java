package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class JEditorPaneExample extends JFrame {
    public static void main(String[] args) {
        JEditorPaneExample frame = new JEditorPaneExample();

        JEditorPane editor = new JEditorPane(
                "text/html",
                "<html><h5>Title</h5><p>Michal S</p><p>Michal S</p></html>"
        );
        editor.setEditable(true);
        editor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Insert update");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Remove update" + editor.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Changed update");
            }
        });

        JScrollPane scrollPane = new JScrollPane(editor);

        frame.add(scrollPane);


        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // wysrodkowane
        frame.setVisible(true);
    }
}
