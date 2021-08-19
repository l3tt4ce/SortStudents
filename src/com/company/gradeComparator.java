package com.company;

import java.util.Comparator;

public class gradeComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        // might need to change this to t.compareTo(t1) < 0
        return Double.compare(Double.parseDouble(s1), Double.parseDouble(s2));
    }
}
