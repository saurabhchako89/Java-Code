package com.java.poc.algo.slidingWindow;

public class SlidingWindowDemo {

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,2,1,1,7,5};
        System.out.println("Max Sum of 3 contiguous numbers : "+max3NumsInArray(nums,3));
    }

    public static int max3NumsInArray(int[] nums, int x){
        int count = 0;
        int sum = 0;
        int maxSum = 0;

        for (int windowStart = 0; windowStart < nums.length; windowStart++) {
            sum += nums[windowStart];
            count ++;
            if(maxSum < sum){
                maxSum = sum;
            }
            if(count >= x){
                break;
            }
        }
    }
}
