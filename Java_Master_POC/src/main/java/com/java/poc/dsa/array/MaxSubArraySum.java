package com.java.poc.dsa.array;

public class MaxSubArraySum {

    public static void main(String[] args) {

        int[] arr = new int[]{-1, 2, -3, 4, -5};

        //maxSubArrayQuadratic(arr);
        maxSubArrayKadane(arr);
    }

    public static int maxSubArrayQuadratic(int[] nums) {
        int n = nums.length;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int current_sum = 0;
            for(int j=i; j<n; j++){
                current_sum = current_sum + nums[j];
                if(current_sum > max_sum){
                    max_sum = current_sum;
                }
            }
        }
        return max_sum;
    }

    public static int maxSubArrayKadane(int[] nums) {

        if(nums==null || nums.length==0)
            return 0;

        int currMax=nums[0], maxSoFar=nums[0];
        for(int i=1; i<nums.length; i++){
            currMax=Math.max(nums[i], currMax+nums[i]);
            maxSoFar=Math.max(currMax, maxSoFar);
        }
        return maxSoFar;
    }
}
