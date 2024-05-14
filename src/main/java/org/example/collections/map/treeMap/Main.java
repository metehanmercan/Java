package org.example.collections.map.treeMap;


import java.util.Iterator;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Student> studentTreeMap = new TreeMap<>(new OrderByNoteComparator());   // name için tip  hatasını  nasıl düzeltebilirim sor

        Student student1 = new Student(50, "mete");
        Student student2 = new Student(40, "ekici");
        Student student3 = new Student(70, "hakkı");
        Student student4 = new Student(60, "ali");
        Student student5 = new Student(10, "bilal");

        studentTreeMap.put(50, student1);
        studentTreeMap.put(40, student2);
        studentTreeMap.put(10, student5);
        studentTreeMap.put(70, student3);
        studentTreeMap.put(60, student4);


        Iterator iterator = studentTreeMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------");

        for (Integer key : studentTreeMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("------");


        // toString ekleyince oldu neden sor?

        Iterator iterator2 = studentTreeMap.values().iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("-------");

        for (Student s1 : studentTreeMap.values()) {
            System.out.println(s1);
        }
    }
}
