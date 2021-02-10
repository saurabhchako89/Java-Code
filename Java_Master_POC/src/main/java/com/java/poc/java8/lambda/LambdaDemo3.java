package com.java.poc.java8.lambda;

public class LambdaDemo3 {

    public static void main(String[] args) {
        String b = "abc";
        ILambdaDemo3 i = a -> a.length();
        System.out.println("Length of the String " + b + " is : " + i.len(b));
    }
}
