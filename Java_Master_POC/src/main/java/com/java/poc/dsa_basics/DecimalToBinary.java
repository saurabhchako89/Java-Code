package com.java.poc.dsa_basics;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Binary representation of " + n + " is: ");
        decToBin(n);
    }

    private static void decToBin(int n) {
        if (n == 0) {
            return;
        }

        decToBin(n / 2);
        System.out.print(n % 2);
    }
}
