package com.java.poc.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfArrayUsingBacktracking {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        System.out.println("The subsets are : "+subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        System.out.println("start index : "+start);
        System.out.println("final list : "+list);
        for(int i = start; i < nums.length; i++){
            System.out.println("current index : "+i+", start : "+start);
            tempList.add(nums[i]);
            System.out.println("tempList before calling backtrack : "+tempList);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
            System.out.println("tempList after removing last element : "+tempList);
        }
    }
}