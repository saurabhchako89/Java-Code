package com.java.poc.dsa.search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,3,1,2};
        int target = 4;
        System.out.println("Input Array is : "+Arrays.toString(nums));
        System.out.println("Index of "+target+" is : "+search(nums,target));
    }

    public static int search(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println("Sorted Array is : "+Arrays.toString(nums));
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int midpoint = left + (right - left)/2;
            if(nums[midpoint] == target){
                return midpoint;
            }else if (nums[midpoint] > target){
                right = midpoint-1;
            }else{
                left=midpoint+1;
            }
        }

        return -1;
    }
}
