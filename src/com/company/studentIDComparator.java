package com.company;

import java.util.Comparator;
import java.util.Objects;

public class studentIDComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer t, Integer t1) {
        if (Objects.equals(t, t1))
            return 0;
        else if (t < t1) // might need to change this to t.CompareTo t.compareTo(t1) < 0
            return -1;
        else
            return 1;
    }
}
