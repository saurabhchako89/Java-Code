package com.java.poc.java8.lambda;

public class LambdaDemo4 {
    public static void main(String[] args) {
        ILambdaDemo4 i = a->a*a;
        System.out.println("The square is : "+i.squareIt(4));
    }
}
