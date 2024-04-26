package org.example.algorithm;

import java.util.Scanner;

public class TersSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int sayi = input.nextInt();
        int yeniSayi = 0;


        while (sayi != 0) {
            yeniSayi += sayi % 10 ;
            sayi /= 10;
            System.out.print(yeniSayi);
            yeniSayi=0;
        }
    }
}
