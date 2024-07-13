package com.java.poc.java8.streams;

import java.util.Map;
import java.util.stream.Collectors;

public class FindStudentCountInEachDept {
    public static void main(String[] args) {
        Map<String, Long> studentCount = new Student().getStudentList().stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        System.out.println("Student count in each dept : "+studentCount);
    }
}
