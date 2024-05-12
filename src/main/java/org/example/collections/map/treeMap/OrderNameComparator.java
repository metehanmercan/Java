package org.example.collections.map.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class OrderNameComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
