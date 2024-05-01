package org.example.collections.set;

import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {

        // tekrar edenler tek görünür yani bir veri tek sefer tutulur
        // sıralama yapar

        TreeSet<Student3> students=new TreeSet<>(new OrderNoteComparator3()); // notu azdan çoğa doğru sıraladık

        students.add(new Student3("mete",20));
        students.add(new Student3("ekici",10));
        students.add(new Student3("ali",60));
        students.add(new Student3("ali",60));

        for (Student3 s1:students) {
            System.out.println( s1.getName() + " notu : " +s1.getNote());

        }


    }
}
