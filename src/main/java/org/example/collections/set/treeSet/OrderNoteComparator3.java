package org.example.collections.set.treeSet;

import java.util.Comparator;

public class OrderNoteComparator3 implements Comparator<Student3> {
    @Override
    public int compare(Student3 o1, Student3 o2) {
        return o1.getNote() - o2.getNote(); // nota göre sıraladı
    }
}
