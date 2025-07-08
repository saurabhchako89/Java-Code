package com.java.poc.dsa.dp;

import java.util.Objects;

/**
 * 647. Palindromic Substrings
 *
 * Given a string s, return the number of palindromic substrings in it.
 *
 * A string is a palindrome when it reads the same backward as forward.
 *
 * A substring is a contiguous sequence of characters within the string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * Example 2:
 *
 * Input: s = "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consists of lowercase English letters.
 */
public class PalindromicSubString {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println("Number of palindromic substrings in \"" + s + "\": " + countSubstrings(s));
    }

    public static int countSubstrings(String s) {

        if(s.isEmpty()){
            return 0;
        }
        int n = s.length();
        boolean [][] dp = new boolean[n][n];
        int count = 0;

        for(int len=1;len<=n;len++){
            for(int i=0;i<=n-len;i++) {
                int j = i + len - 1;

                if(s.charAt(i) == s.charAt(j)) {
                    if (len == 1 || len == 2) {
                        dp[i][j] = true; // Single character or two same characters are palindromes
                    } else {
                        dp[i][j] = dp[i + 1][j - 1]; // Check the inner substring
                    }
                } else {
                    dp[i][j] = false; // Not a palindrome
                }

                if (dp[i][j]) {
                    count++; // Increment count for each palindromic substring found
                }
            }
        }

        return count;
    }
}
