package org.example.collections.map.treeMap;

import java.util.Iterator;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Student,Integer> student = new TreeMap<>(new OrderNameComparator());

        student.put(new Student(50, "mete"),50);
        student.put(new Student(40, "ekici"),40);
        student.put(new Student(70, "hakkı"),70);
        student.put(new Student(60, "ali"),60);


        Iterator iterator = student.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------");

    }
}
