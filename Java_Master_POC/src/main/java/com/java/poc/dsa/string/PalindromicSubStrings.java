package com.java.poc.dsa.string;

public class PalindromicSubStrings {

    public static void main(String[] args) {
        System.out.println("Total count of palindromic substrings : "+countSubstrings("abbcacacb"));
    }
    public static int countSubstrings(String s) {
        int count = 0;
        int len = s.length();
        for(int i = 0; i< s.length(); i++){
            for(int j = i+1; j <= s.length();j++){
                String tmp = s.substring(i,j);
                if(checkPalindrome(tmp)){
                    System.out.println("palindromic substring : "+tmp);
                    count ++;
                }
            }
        }
        return count;
    }

    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}

