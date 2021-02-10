package com.java.poc.algo.array;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int arr[] = new int[]{6, 3, 1, 8, 9, 2, 4, 7, 10, 5};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
