package com.java.poc.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutations {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(permute(nums));

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutationList = new ArrayList<>();
        List<Integer> variationsList;
        StringBuilder sb;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                sb = new StringBuilder();
                variationsList = new ArrayList<>();
                int tmp = nums[i];
                nums[j] = nums[j + 1];
                nums[j + 1] = tmp;

                for (int x : nums) {
                    sb.append(x);
                }
                variationsList.add(Integer.valueOf(sb.toString()));
                permutationList.add(variationsList);
            }
        }

        return permutationList;
    }
}
