package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Student> list = new LinkedList<>();
        readFile(list);

        System.out.println("List sorted by last name:");
        list.sort(new nameComparator());
        for (Student s : list) {
            System.out.println(s);
        }

        sort(list, new studentIDComparator());
        System.out.println("List sorted by student ID:");
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public static void readFile(List<Student> list) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/home/l3ttuce/IdeaProjects/SortStudents/Students.txt"));
        while (scanner.hasNext()){
            List<String> temp = new LinkedList<>();
            String words = scanner.nextLine();
            Scanner line = new Scanner(words);
            while (line.hasNext()){
                temp.add(line.next());
            }
            Student st = new Student(temp);
            list.add(st);
        }
    }

    public static void sort(List<Student> list, Comparator<Student> c){
        list.sort(c);
    }
}
