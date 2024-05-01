package org.example.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();

        // tekrar edenler tek görünür yani bir veri tek sefer tutulur

        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(null); // null  değer atanabilir

        System.out.println(hSet.size()); // burası boyutunu verir
        System.out.println(hSet.isEmpty()); // boş mu dolu mu diye sorgulama yapar
        System.out.println(hSet.contains(20)); // bir değer var mı yok mu kontrolü yapılır

        System.out.println("-------------");
        for (Integer sayi : hSet) {
            System.out.println(sayi);
        }
        System.out.println("--------");
        
          
         // iterator kullanarakta gezinebiriz hashSetimizi
        Iterator<Integer> itr=hSet.iterator();
        while (itr.hasNext()){   // hasnext bi sonraki eleman var mı kontrolü yapar
            System.out.println(itr.next());   // next ise o  elemanı getirir
        }
    }
}
