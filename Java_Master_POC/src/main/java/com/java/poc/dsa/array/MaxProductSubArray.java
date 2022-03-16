package com.java.poc.dsa.array;

public class MaxProductSubArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,-4,0,8,-12};
        System.out.println("Max product of the array "+maxProduct(nums));
    }

    private static int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] >=0){
                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);
            }else{
                int tmp = max;
                max = Math.max(nums[i], min * nums[i]);
                min = Math.min(nums[i], tmp * nums[i]);
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
