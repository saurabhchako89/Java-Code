package com.java.poc.dsa.blindPracticeList;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("rat","tar"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] chars_s = s.toCharArray();
        Arrays.sort(chars_s);
        StringBuilder sb1 = new StringBuilder();
        for(Character c1 : chars_s){
            sb1.append(c1.toString());
        }

        char[] chars_t = t.toCharArray();
        Arrays.sort(chars_t);
        StringBuilder sb2 = new StringBuilder();
        for(Character c2 : chars_t){
            sb2.append(c2.toString());
        }

        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
}
