package com.java.poc.java8.streams;

import java.util.OptionalInt;

public class MaxAgeOfStudent {
    public static void main(String[] args) {
        OptionalInt max = new Student().getStudentList().stream().mapToInt(student -> student.getAge()).max();
        System.out.println("max age is : "+max.getAsInt());
    }
}
