package org.example.algorithm;

import java.util.Scanner;

public class BasamaklarToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int sayi = input.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("basamaklar toplamı : " + toplam);
    }
}
