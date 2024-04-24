package org.example;

import java.util.Random;

public class Math {
    public static void main(String[] args) {
        // üs alma
        System.out.println(java.lang.Math.pow(2,4));
        int a=(int) java.lang.Math.pow(3,5);
        System.out.println(a);


        // karekök bulma
        System.out.println(java.lang.Math.sqrt(49));
        int b=(int) java.lang.Math.sqrt(49);
        System.out.println(b);

        // random sayı üretme
        System.out.println(java.lang.Math.random());

        int c=(int) (java.lang.Math.random()*10);
        System.out.println(c);
    }
}
