package com.java.poc.blind75;

import java.util.*;

public class LC1_TwoSum {


    public static void main(String[] args) {
        int[] arr = {8, 7, 10, 4, 5, 5, 5};
        System.out.println("input array : " + Arrays.toString(arr));
        int target = 15;
        System.out.println("target : " + target);
        printResult(calculate_using_brute_force(arr, target));
        printResult(calculate_using_sorting(arr,target));
        printResult(calculate_using_hashing(arr,target));
    }

    private static void printResult(int[] arr){
        if (arr.length == 0) {
            System.out.println("No matching pair found !");
        } else {
            System.out.println("The matching pair(s) are : "+Arrays.toString(arr));
        }
    }
    //O(n^2) time complexity, O(1) space complexity
    private static int[] calculate_using_brute_force(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //O(nlog(n)) time complexity, O(1) space complexity
    private static int[] calculate_using_sorting(int[] arr, int target) {
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] + arr[high] == target) {
                return new int[]{arr[low], arr[high]};
            }

            // increment the low index if sum is less than target. Else, decrement high index.
            if (arr[low] + arr[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[]{-1,-1};
    }

    //O(n) time complexity, O(n) space complexity
    private static int[] calculate_using_hashing(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[]{arr[i], target - arr[i]};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}
