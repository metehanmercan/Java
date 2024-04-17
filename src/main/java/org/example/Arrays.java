package org.example;

public class Arrays {
    public static void main(String[] args) {
        // array kopyalama
        int[] dizi1 = {1, 3, 5, 7, 9};
        int[] dizi2 = new int[5];
        System.arraycopy(dizi1, 0, dizi2, 0, 5);
        for (int i = 0; i < dizi2.length; i++)
            System.out.print(dizi2[i] + " ");
    }
}
