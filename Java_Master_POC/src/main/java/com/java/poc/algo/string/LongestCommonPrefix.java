package com.java.poc.algo.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"faxyz", "fanbxyz","fabxyz", "fabcxyz"};
        checkLongestCommonPrefix(strs);
    }

    private static void checkLongestCommonPrefix(String[] strs) {
        System.out.println("unsorted array is : "+ Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println("sorted array is : "+ Arrays.toString(strs));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.length-1;i++){
            if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }else{
                break;
            }
        }

        System.out.println("longest common prefix is : "+sb.toString());
    }
}
