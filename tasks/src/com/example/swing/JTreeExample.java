package com.example.swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;

public class JTreeExample extends JFrame {
    public static void main(String[] args) {
        JTreeExample frame = new JTreeExample();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("ROOT");
        JTree tree = new JTree(root);

        DefaultMutableTreeNode cars = new DefaultMutableTreeNode("Cars");
        cars.add(new DefaultMutableTreeNode("Dodge"));
        cars.add(new DefaultMutableTreeNode("Porsche"));
        cars.add(new DefaultMutableTreeNode("Audi"));
        root.add(cars);

        DefaultMutableTreeNode bikes = new DefaultMutableTreeNode("bikes");
        bikes.add(new DefaultMutableTreeNode("Honda"));
        bikes.add(new DefaultMutableTreeNode("BMW"));
        root.add(bikes);

        for(int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }

        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                Object el = e.getNewLeadSelectionPath().getLastPathComponent();
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) el;
                System.out.println("Selected: " + node);
            }
        });


        frame.add(tree);




        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
