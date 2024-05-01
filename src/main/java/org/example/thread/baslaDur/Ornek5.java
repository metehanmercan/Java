package org.example.thread.baslaDur;

public class Ornek5 extends Thread{

    public Ornek5 (String isim){
        super(isim);
        start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
