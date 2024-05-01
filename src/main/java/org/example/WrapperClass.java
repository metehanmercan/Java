package org.example;

public class WrapperClass {
    public static void main(String[] args) {
        //wrapper’lar buyuk harfle baslar cunku class’tirlar amacı primitiv tiplerin metot yolunu açmaktır
// primitive     : char     - boolean - byte - short - int     - long - float - double
//wrapper class : Character - Boolean - Byte - Short - Integer - Long - Float - Double

        //wrapper'lar buyuk harfle baslar cunku class'tirlar
        // primitive          : char          - boolean - byte - short - int         - long  - float  - double
        //wrapper class       : Character     - Boolean - Byte - Short - Integer     - Long  - Float  - Double

        // i. yazınca metot gelmez
        int i = 12;

        // k. yazınca metotlar gelir
        Integer k = 20;

        //Autoboxing - Unboxing
        /*Java’da primitive(ilkel) türler ve wrapper sınıfları arasında otomatik dönüşüm yapabilen
         autoboxing ve unboxing mekanizmaları vardır. Autoboxing, primitive bir türü otomatik olarak onun
         wrapper sınıfına çevirir. Örneğin, long’u Long’a dönüştürür. Unboxing ise tam tersi bir işlem yapar,
         Long’u long’a dönüştürür. Ikisi de otomatik gerceklesir.*/

    }
}
