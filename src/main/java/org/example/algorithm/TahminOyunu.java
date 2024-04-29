package org.example.algorithm;

import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {
        Random random=new Random();
        int n= random.nextInt(20);


        int hak=5;
        Scanner input=new Scanner(System.in);
       while (hak>0){
            System.out.println("tahmin sayısını giriniz : ");
           int sayi=input.nextInt();
           if (sayi==n){
               System.out.println("tahmin doğru tebrikler");
               break;
           } else if (sayi<n) {
               System.out.println("sayıyı yükselt");

           } else if (sayi>n) {
               System.out.println("sayıyı küçült");

           }
           hak--;
           System.out.println( hak+" hakkınız kaldı");
           if (hak<1){
               System.out.println("kaybettin");
           }
       }

    }
}
