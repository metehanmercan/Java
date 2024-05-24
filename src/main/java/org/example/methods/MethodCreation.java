package org.example.methods;

public class MethodCreation {
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(multiply(3,6));
        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));
      print("mesaj");

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
}
