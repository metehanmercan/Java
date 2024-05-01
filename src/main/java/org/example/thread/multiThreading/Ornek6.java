package org.example.thread.multiThreading;

public class Ornek6 extends Thread{
    int sayi;

    public Ornek6(int sayi){
      this.sayi=sayi;
      synchronized (this){
          start();
          System.out.println();
          for (int i=1;i<=sayi;i++){
              System.out.println(i);
          }
      }
    }
    @Override
    public void run() {
    }
}
