package com.java.poc.algo.array;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,5,7,9,10,11,16};
        int[] arr2 = new int[]{2,4,6,8,12,13,14,15};
        mergeSortedArrays(arr1,arr2);
    }

    private static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        while( i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
