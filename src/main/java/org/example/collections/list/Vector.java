package org.example.collections.list;

import java.util.Iterator;

public class Vector {
    public static void main(String[] args) {

        java.util.Vector<String> vector = new java.util.Vector<>();
        vector.add("ankara");
        vector.add("adana");
        vector.add("mersin");
        vector.add("izmir");

        Iterator<String> itr= vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
