package com.java.poc.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStudentByDept {
    public static void main(String[] args) {
        Map<String, List<Student>> mapData = new Student().getStudentList().stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println("Students grouped by the department names : "+mapData);
    }
}
