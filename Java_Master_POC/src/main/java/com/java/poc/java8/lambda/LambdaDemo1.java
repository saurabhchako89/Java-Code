package com.java.poc.java8.lambda;

public class LambdaDemo1 {

    public static void main(String[] args) {
        ILambdaDemo1 i = () -> System.out.println("Hello");
        i.print();
    }
}
