package org.example.algorithm;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi= input.nextInt();
        int bolen=0;
        for (int i=1; i<sayi;i++){
            if (sayi%i==0){
                bolen+=1;
            }
        }
        if (bolen<2 && sayi!=1){
            System.out.println("sayı asaldır");
        }else {
            System.out.println("sayı asal değildir");
        }
    }
}
