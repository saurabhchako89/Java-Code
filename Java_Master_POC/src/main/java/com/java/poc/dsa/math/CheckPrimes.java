package com.java.poc.dsa.math;

public class CheckPrimes {

    public static void main(String[] args) {

        int num = 100;
        isPrime(num);
    }

    private static void isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println("Number is not a prime number !");
            }
        }
    }
}
