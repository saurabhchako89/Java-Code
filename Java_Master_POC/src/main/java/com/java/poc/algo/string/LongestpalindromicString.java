package com.java.poc.algo.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestpalindromicString {
    public static void main(String[] args) {
        String str = "babad";
        longestPalindrome(str);
    }

    public static String longestPalindrome(String s) {
        StringBuilder sb;
        List<String> subStrings = new ArrayList<String>();
        List<String> palindromes = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                subStrings.add(s.substring(i,j));
            }
        }
        System.out.println(subStrings);
        for(String key : subStrings){
            if(key.equals(new StringBuilder().append(key).reverse().toString())){
                palindromes.add(key);
            }
        }
        Collections.sort(palindromes);
        System.out.println(palindromes);
        return palindromes.get(palindromes.size() - 1);
    }
}
