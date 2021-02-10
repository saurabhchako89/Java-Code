package com.java.poc.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Array3Sum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("input array : " + Arrays.toString(arr));
        int target = 10;
        System.out.println("target : " + target);
        List<List<Integer>> arrElementList = calculate_using_brute_force(arr, target);
        //List<List<Integer>> arrElementList = calculate_using_sorting(arr,target);
        //List<List<Integer>> arrElementList = calculate_using_hashing(arr,target);

        if (arrElementList.size() == 0) {
            System.out.println("No matching triplet found !");
        } else {
            System.out.println("The matching triplet(s) are : ");
            for (List<Integer> i : arrElementList) {
                System.out.println(Arrays.toString(i.toArray()));
            }
        }
    }

    private static List<List<Integer>> calculate_using_brute_force(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = null;
        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        subList = new ArrayList<Integer>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[k]);
                        set.add(subList);
                    }
                }
            }
        }

        list.addAll(set);

        return list;
    }


    private static List<List<Integer>> calculate_using_sorting(int[] nums,int target) {
        List<List<Integer>> elementList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.length-1;
                int sum = target-nums[i];

                while(low<high){
                    if(nums[low]+nums[high] == sum){
                        elementList.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low] == nums[low+1]) low++;
                        while(low<high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }else if(nums[low]+nums[high]<sum){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return elementList;
    }
}
