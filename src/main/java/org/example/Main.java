package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("boyunuzu metre cinsinden giriniz : ");
        double boy= input.nextDouble();
        System.out.println("kilonuzu giriniz : ");
        double kilo=input.nextDouble();

        double index=kilo/(boy*boy);

        System.out.println("boy kilo indeksiniz : "+ index);
    }
}