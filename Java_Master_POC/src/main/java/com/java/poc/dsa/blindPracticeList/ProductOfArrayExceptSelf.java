package com.java.poc.dsa.blindPracticeList;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

        System.out.println(Arrays.toString(productExceptSelfOptimised(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length;i++){
            int prod = 1;
            for(int j=0;j<nums.length;j++){
                if(i == j){
                    continue;
                }else{
                    prod*=nums[j];
                }
            }
            result[i] = prod;
        }

        return result;
    }


    public static int[] productExceptSelfOptimised(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length;i++){
            int prod = 1;
            for(int j=0;j<nums.length;j++){
                if(i == j){
                    continue;
                }else{
                    prod*=nums[j];
                }
            }
            result[i] = prod;
        }

        return result;
    }
}
