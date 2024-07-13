package com.java.poc.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStudentByName {
    public static void main(String[] args) {

        List<Student> studentList = new Student().getStudentList().stream().filter(a -> a.getFirstName().startsWith("A")).collect(Collectors.toList());

        System.out.println("Filtered Student List is : "+studentList);
    }
}
