package org.example.methods;

public class MethodOverloading {
    public static void main(String[] args) {

     add(2,4);
     add(2,6.5);
     add(0.5,4);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void add(int a, double b) {
        System.out.println(a + b);
    }
    public static void add(double a, int b) {
        System.out.println(a + b);
    }
}
