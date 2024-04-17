package org.example;


public class Main {
    public static void main(String[] args) {

        // string veri tipini int'e çevirme
        String a = "5";
        int b = Integer.valueOf(a);
        System.out.println(b * b);

        // int  veri tipini stringe çevirme
        int c = 9;
        String d = String.valueOf(c);
        System.out.println(d);

        // üs alma
        System.out.println((int) (Math.pow(2, 2)));



    }
}