package org.example.collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {

        // HashMapten farkı sıralı olarak verir cıktıyı
        LinkedHashMap<Integer,String> h1=new LinkedHashMap<>();

        h1.put(1,"adana");
        h1.put(2,"mersin");
        h1.put(3,"sinop");

        Iterator itr=h1.values().iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
