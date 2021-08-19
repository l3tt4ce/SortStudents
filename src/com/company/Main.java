package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        readInput(list);
        System.out.println("Student #1: " + list.get(0));
    }

    public static void readInput(List<String> list) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/home/l3ttuce/IdeaProjects/SortStudents/Students.txt"));
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
    }
}
