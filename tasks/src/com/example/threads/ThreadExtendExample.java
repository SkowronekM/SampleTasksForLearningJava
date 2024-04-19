package com.example.threads;

import com.example.oop.basics.iheritance.final_example.Test;

class TestNewThread extends Thread {

    private int sleepTime;
    public TestNewThread(String name, int sleepTime) {
        super(name);
        this.sleepTime = sleepTime;
    }

    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.println("Wątek: " + this.getName()+ ", iteracja nr: " + i);
            try {
                this.sleep(this.sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExtendExample {
    public static void main(String[] args) {

        TestNewThread test = new TestNewThread("thread 1", 1000);
        test.start();

        TestNewThread thread2 = new TestNewThread("thread 2", 700);
        thread2.start();



    }
}
