package com.java.poc.java_basics.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubsequence {

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2};
        List<Integer> arrList = new ArrayList<>();

        printSubSeq(arr,0,arrList);
    }

    private static void printSubSeq(int[] arr, int index, List<Integer> arrList) {
        if(index == arr.length){
            if(arrList.size() > 0){
                System.out.println(arrList);
            }
        }else{

            arrList.add(arr[index]);
            printSubSeq(arr,index+1,arrList);
            arrList.remove(arrList.size()-1);

            printSubSeq(arr,index+1,arrList);
        }
    }
}
