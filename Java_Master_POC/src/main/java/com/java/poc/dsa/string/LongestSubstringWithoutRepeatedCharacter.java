package com.java.poc.dsa.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * Solved
 * Medium
 * Topics
 * Companies
 * Hint
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
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
