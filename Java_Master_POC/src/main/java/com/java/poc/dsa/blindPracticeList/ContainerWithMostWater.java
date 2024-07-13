package com.java.poc.dsa.blindPracticeList;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println("Max area is : "+maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;

        while(left<right){
            int container_length = right-left;
            int area = container_length * Math.min(height[left],height[right]);
            max = Math.max(area,max);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
