package org.example.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
    public static void main(String[] args) {

        // tekrar edenler tek görünür yani bir veri tek sefer tutulur
        // hashSetten farkı ilk gireni ilk verir
        LinkedHashSet<Integer> lSet=new LinkedHashSet<>();

        lSet.add(10);
        lSet.add(10);
        lSet.add(20);
        lSet.add(30);

        Iterator<Integer> itr= lSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next() );
        }
    }
}
