package org.example.collections.set;

import java.util.Comparator;

public class OrderNameComparator3 implements Comparator<Student3> {
    @Override
    public int compare(Student3 o1, Student3 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
