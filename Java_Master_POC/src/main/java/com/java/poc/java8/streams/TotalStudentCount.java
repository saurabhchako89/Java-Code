package com.java.poc.java8.streams;

public class TotalStudentCount {
    public static void main(String[] args) {
        long count = new Student().getStudentList().stream().count();
        System.out.println("Total student count is : "+count);
    }
}
