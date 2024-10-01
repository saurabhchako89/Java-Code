package com.java.poc.dsa.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatedCharacter {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcaabb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lookup = new HashMap<>();
        int result = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            if(lookup.containsKey(s.charAt(right))) {
                left = Math.max(left, lookup.get(s.charAt(right)));
            }
            result = Math.max(result, right - left + 1);
            lookup.put(s.charAt(right), right + 1);
        }
        return result;
    }
}
