package org.example.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String,Integer> number=new HashMap<>();

        // cıktı sıralı değildir
        // mape ekleme put ile yapılır
        number.put("one",1);
        number.put("two",2);
        number.put("three",3);
        number.put("four",4);
        number.put("five",5);

        Iterator iterator=number.keySet().iterator();  // keySet() bize küme koleksiyon öğesi olarak verir keyleri
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------");

        Iterator iterator1=number.values().iterator();  // values() bize COLLECTİON  öğesi olarak verir anaktarları
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
