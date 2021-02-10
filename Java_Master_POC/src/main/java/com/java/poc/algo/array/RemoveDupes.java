package com.java.poc.algo.array;

import java.util.Arrays;

public class RemoveDupes {

    public static void main(String[] args) {

        int[] nums = new int[]{3, 3, 4, 1, 2, 4, 5, 1, 2, 5, 5};
        System.out.println("The length of unique elements is : " + removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int j = 0;
        int i = 1;
        System.out.println("Original Array : " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Sorted Array : " + Arrays.toString(nums));
        if (nums.length > 1) {
            while (i < nums.length) {
                if (nums[i] != nums[j]) {
                    j++;
                    nums[j] = nums[i];
                }
                i++;
            }
            System.out.println("After Operation on Array : " + Arrays.toString(nums));
        }
        return j + 1;
    }
}
