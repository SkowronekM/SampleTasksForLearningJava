package com.example.swing;

import javax.swing.*;

public class JOptionPaneShowConfirmDialog {
    public static void main(String[] args) {

        int result = JOptionPane.showConfirmDialog(
                null,
                "Czy zapisać dane?",
                "Dane",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        String str = "";
        switch (result) {
            case JOptionPane.YES_OPTION:
                str = "yes";
                break;
            case JOptionPane.NO_OPTION:
                str = "no";
                break;
            case JOptionPane.CANCEL_OPTION:
                str = "cancel";
                break;
        }

        System.out.println("Wybrana opcja to: " + str);
    }
}
