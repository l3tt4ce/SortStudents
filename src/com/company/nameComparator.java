package com.company;

import java.util.Comparator;

public class nameComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        String s = st1.getLastName();
        String s2 = st2.getLastName();
        if (s.compareToIgnoreCase(s2) == 0)
            return 0;
        else if (s.compareToIgnoreCase(s2) < 0)
            return -1;
        else
            return 0;
    }
}
