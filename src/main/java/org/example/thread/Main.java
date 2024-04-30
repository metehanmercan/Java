package org.example.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

      Counter2 c1 = new Counter2("c1", 1);
        Counter2 c2 = new Counter2("c2", 2);
        Counter2 c3 = new Counter2("c3", 3);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);


        t1.start();
        Thread.sleep(4000);
        c1.stop();
        t2.start();
        t3.start();



    }
}
