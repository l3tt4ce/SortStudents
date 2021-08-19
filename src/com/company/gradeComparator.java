package com.company;

import java.util.Comparator;

public class gradeComparator implements Comparator<Double> {
    public int compare(Double num1, Double num2){
        if (num1.equals(num2))
            return 0;
        else if (num1.compareTo(num2) < 0)
            return -1;
        else
            return 0;
    }
}
