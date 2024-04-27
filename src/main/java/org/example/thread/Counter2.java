package org.example.thread;

public class Counter2 implements Runnable{
  private   String name;
  private int id;
  private boolean isRun=true;

    public Counter2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        int i=0;
      while (isRun){
              try {
                  Thread.sleep(1000L*this.id);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
              System.out.println(this.getName() + "  " + i++);
          }
      }
    public void stop(){
        this.isRun=false;
    }
}
