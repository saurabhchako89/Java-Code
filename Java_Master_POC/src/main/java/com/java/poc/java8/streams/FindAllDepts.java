package com.java.poc.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllDepts {
    public static void main(String[] args) {
        List<String> deptList = new Student().getStudentList().stream().map(a -> a.getDepartmantName()).collect(Collectors.toList());
        System.out.println("Department List is : "+deptList);
    }
}
