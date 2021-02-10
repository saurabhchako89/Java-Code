package com.java.poc.algo.array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int[] nums = {-2,0,1,1,3,4,5};
        int n = 16;

        //System.out.println("The missing number is : "+findMissingNum(nums,n));

        System.out.println("The missing numbers are : ");
        printMissingNumber(nums,n);
    }

    private static int findMissingNum(int[] nums, int n){
        int missing_num = 0;

        int sum_of_nums = (n * (n + 1))/2 ;
        int sum_of_series = 0;

        for(int i : nums){
            sum_of_series = sum_of_series + i;
        }

        missing_num = sum_of_nums - sum_of_series;
        return missing_num;
    }

    /**
     * A general method to find missing values from an integer array in Java.
     * This method will work even if array has more than one missing element.
     */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }

}
