package org.example.algorithm;

import java.util.Scanner;

public class KareAlanCevre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("karenin bir kenarını cm cinsinden giriniz : ");
        double a= input.nextDouble();

        System.out.println("alan = "+ Math.pow(a,2));
        System.out.println("çevre = " + 4*a);
    }
}
