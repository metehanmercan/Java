package org.example.methods.staticMethods;

public class StaticMethods {

    public static void main(String[] args) {

        /*
      "static"----> bir classın içerisindeki değişken ya da metoda nesne üretmeden clas adı ile ulaşmamıza olanak sağlar
         */
        // nesne üretmeden ulaştık
        Student.setLastName("MERCAN");
        Student.write();
    }
}
