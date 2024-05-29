package org.example.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodCreation {
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(multiply(3,6));
        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));
      print("mesaj");

      int dizi1[]=new int[]{1,4,7};
        System.out.println(Arrays.toString(islemYap(dizi1)));

    }
    public static int sum(int a,int b) {
    return a+b;
    }
    protected static int multiply(int x,int y){
        return x*y;
    }
    private static int firstTwoMultiplyThirdAdd(int a,int b,int c){
        return (a*b)+c;
    }
    public static void print(String str){
        System.out.println(str);
    }

    // metotlara dizi olarakta parametre geçebiliriz
    public static int[] islemYap(int[] dizi){
        int[] newList= new int[3];
        for (int i = 0; i <dizi.length ; i++) {

          newList[i]=dizi[i]*2;
        }
        return newList;
    }
}

