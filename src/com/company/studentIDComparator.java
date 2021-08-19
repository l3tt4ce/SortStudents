package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class studentIDComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        String s1 = st1.getId();
        String s2 = st2.getId();
        if (Integer.parseInt(s1) == Integer.parseInt(s2))
            return 0;
        else if (Integer.parseInt(s1) < Integer.parseInt(s2)) // might need to change this to t.compareTo(t1) < 0
            return -1;
        else
            return 1;
    }
}
