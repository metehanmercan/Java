package org.example.algorithm;

public class Collatz {
    public static int Collatz(int x) {
        if (x == 1) {
            return 1;
        } else if (x % 2 == 0) {
            return Collatz(x / 2);
        } else {
            return Collatz(3 * x + 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 107; i < 207; i++) {
            System.out.println(i + "\tCollatz->\t" + Collatz(i));
        }
    }
}
