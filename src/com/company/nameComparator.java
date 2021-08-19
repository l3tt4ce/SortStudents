package com.company;

import java.util.Comparator;

public class nameComparator implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        if (s.compareToIgnoreCase(t1) == 0)
            return 0;
        else if (s.compareToIgnoreCase(t1) < 0)
            return -1;
        else
            return 0;
    }
}
