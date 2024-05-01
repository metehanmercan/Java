package org.example.thread.runnable;

public class Ornek4 implements  Runnable{
    Thread kanal;

  public void ornekThreadRunnable(){
      kanal=new Thread(this);
      kanal.start();
      try {
          kanal.sleep(2000);
      }catch (Exception e){
          e.printStackTrace();
      }
  }

    @Override
    public void run() {
        ornekThreadRunnable();
    }
}
