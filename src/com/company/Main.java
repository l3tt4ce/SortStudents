package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Student> list = new LinkedList<>();
        readFile(list);

        //list.sort(new nameComparator());
        for (Student s : list){
            System.out.println(s);
        }

        sort(list);
    }

    public static void readFile(List<Student> list) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/home/l3ttuce/IdeaProjects/SortStudents/Students.txt"));
        while (scanner.hasNext()){
            Student st = new Student(new LinkedList<>());
            list.add(st);
        }
    }

    public static void sort(List<Student> list){
        list.sort(new studentIDComparator());
    }
}
