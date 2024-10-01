package com.java.poc.dsa_basics;

import java.util.Arrays;

public class AddOneToIntArray {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        System.out.println(Arrays.toString(addOne(arr)));
    }

    public static int[] addOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if(arr[i] < 9) {
                arr[i] += 1;
                return arr;
            }
            arr[i] = 0;
        }
        arr = new int[n+1];;
        arr[0] = 1;
        return arr;
    }
}
