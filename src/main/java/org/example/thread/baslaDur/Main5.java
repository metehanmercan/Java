package org.example.thread.baslaDur;

public class Main5 {
    public static void main(String[] args) {

        Thread thread1=new Ornek5("1. thread");
        thread1.setPriority(Thread.MIN_PRIORITY); // DÜŞÜK ÖNCELİK ATAMASI
        Thread thread2=new Ornek5("2. thread");
        Thread thread3=new Ornek5("3. thread");
        thread3.setPriority(Thread.MAX_PRIORITY);  // FAZLA ÖNCELİK ATAMASI
        Thread thread4=new Ornek5("4. thread");
    }
}
