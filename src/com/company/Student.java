package com.company;

import java.util.List;
import java.util.Scanner;

public class Student {
    public List<String> list;

    public Student(List<String> list){
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public String getLastName(){
        return this.list.get(0);
    }
    public String getId(){
        return this.list.get(2);
    }
    public String getGrade(){
        return this.list.get(3);
    }

    @Override
    public String toString() {
        return "Student{" +
                "list=" + list +
                '}';
    }
}
