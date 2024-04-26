package org.example.algorithm;

import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("taban değerini giriniz : ");
        int taban= input.nextInt();
        System.out.println("üs değerini giriniz : ");
        int kuvvet= input.nextInt();
        int sonuc=1;

        for (int i=1; i<=kuvvet;i++){
            sonuc*=taban;
        }
        System.out.println("sonuç : " + sonuc);
    }
}
