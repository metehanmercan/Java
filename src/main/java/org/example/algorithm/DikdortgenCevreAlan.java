package org.example.algorithm;

import java.util.Scanner;

public class DikdortgenCevreAlan {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("kısa kenar uzunluğunu giriniz : ");
        double a = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("uzun kenar uzunluğunu giriniz : ");
        double b = input2.nextDouble();

        System.out.println("çevre : " + 2 * (a + b));
        System.out.println("alan : " + (a * b));
    }
}
