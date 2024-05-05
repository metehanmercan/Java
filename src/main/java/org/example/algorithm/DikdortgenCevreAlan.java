package org.example.algorithm;

import java.util.Scanner;

public class DikdortgenCevreAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kısa kenar uzunluğunu giriniz : ");
        double a = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("uzun kenar uzunluğunu giriniz : ");
        double b = input.nextDouble();

        System.out.println("çevre : " + 2 * (a + b));
        System.out.println("alan : " + (a * b));
    }
}

