package org.example.algorithm;

import java.util.Scanner;

public class IkiSayiKarsilastirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz : ");
        double a = input.nextDouble();
        System.out.println("ikinci sayıyı giriniz : ");
        double b = input.nextDouble();

        if (a < b) {
            System.out.println(a + " küçüktür " + b);
        } else if (b < a) {
            System.out.println(b + " küçüktür " + a);
        } else {
            System.out.println(a + " eşittir " + b);
        }
    }
    // 1-2-3-4-5-6-7-8-9-10-11-12-13
}
