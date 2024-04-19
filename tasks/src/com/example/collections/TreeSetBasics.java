package com.example.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String[] args) {

        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(56);
        treeset.add(4);
        treeset.add(23);
        treeset.add(1);

        Iterator<Integer> iterator = treeset.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<Integer> descendingIterator = treeset.descendingIterator();
        while(descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }


    }
}
