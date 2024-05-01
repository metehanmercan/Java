package org.example.thread.extendss;

public class Ornek2 extends Thread{
    public Ornek2(){
        start();
    }

    @Override
    public void run() {
        for (int i=0; i<5;i++){
            System.out.println(i);
        }
    }
}
