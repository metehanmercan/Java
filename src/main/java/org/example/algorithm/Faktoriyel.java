package org.example.algorithm;

import java.util.Scanner;

public class Faktoriyel {
    public static int faktoriyel(int a) {
        int sonuc=1;
        for (int i = 1; i <= a; i++) {
             sonuc*=i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi = input.nextInt();

        System.out.println("sonuc : " +  faktoriyel(sayi));

    }

}
