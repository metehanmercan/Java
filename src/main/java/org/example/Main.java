package org.example;


import org.example.thread.Counter;

public class Main {
    public static void main(String[] args) {
        Counter c1=new Counter("counter-1");
        Counter c2=new Counter("counter-2");

        c1.start();
        c2.start();
    }
}