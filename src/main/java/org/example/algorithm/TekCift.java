package org.example.algorithm;

import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int a= input.nextInt();
        if (a%2==0){
            System.out.println(a + "  girilen sayı çifttir");
        }else {
            System.out.println(a + "  girilen sayı tektir");
        }

    }
}
