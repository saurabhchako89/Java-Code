package com.java.poc.dsa.string;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "tea";
        String str2 = "eatw";
        check(str1,str2);
    }

    private static void check(String str1, String str2) {
        char[] chars1 = null;
        char[] chars2 = null;
        for(int i = 0; i<str1.length();i++){
            chars1= str1.toCharArray();
            Arrays.sort(chars1);
        }

        for(int j = 0; j<str2.length();j++){
            chars2 = str2.toCharArray();
            Arrays.sort(chars2);
        }

        if(Arrays.equals(chars1, chars2)){
            System.out.println("The strings are Anagrams");
        } else{
            System.out.println("The strings are not Anagrams");
        }
    }
}
