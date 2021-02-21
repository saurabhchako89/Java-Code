package com.java.poc.algo.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatesInArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,2,3,3,4,5};

        findDupes(nums);
    }

    private static void findDupes(int[] nums) {
        Map<Integer,Integer> integerMap = new HashMap<>();
        List<Integer> dupArray = new ArrayList<>();
        for (int num : nums) {
            if (integerMap.containsKey(num)) {
                integerMap.put(num, integerMap.get(num)+1);
            } else {
                integerMap.put(num, 1);
            }
        }
        System.out.println(integerMap.toString());

        for(int key : integerMap.keySet()){
            if(integerMap.get(key) > 1){
                dupArray.add(key);
            }
        }

        System.out.println("The duplicates are : "+ dupArray.toString());
    }

}
