package com.example.collections;

import java.util.PriorityQueue;

public class PriorityQueueExampleBasics {
    public static void main(String[] args) {

        PriorityQueue<Integer> test = new PriorityQueue<>();
        test.add(99);
        test.add(56);
        test.add(88);
        test.add(14);

        while(!test.isEmpty()) {
            System.out.println(test.poll());
        }

        test.add(100);
        test.add(45);
        test.add(74);

        System.out.println(test.peek());
    }
}
