package org.example.thread.extendss;

public class Ornek3 extends Thread {
    private int sayi;
    private String ad;

    public Ornek3(int sayi, String ad) {
        this.ad = ad;
        this.sayi = sayi;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(" SAYI VE AD : "+ad+" " +sayi);
        }
    }
}
