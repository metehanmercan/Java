package org.example.methods;

public class RecursionMethods {
    static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else
            return (number * factorial(number - 1));
    }

    static int sum(int number) {
        if (number == 0) {
            return 0;
        } else
            return (number + (sum(number - 1)));
    }



    public static void main(String[] args) {
        // özyineleme

        System.out.println(factorial(5)); // 120
        System.out.println(sum(4));   // 4 ten 1 e kadar sürekli kendini çağırır toplar
    }
}
