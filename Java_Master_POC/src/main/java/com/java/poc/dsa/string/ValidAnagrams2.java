package com.java.poc.dsa.string;

public class ValidAnagrams2 {

    public static void main(String[] args) {
        String s = "cat";
        String t = "act";
        System.out.println("Is valid anagram ? "+isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for (char c : s.toCharArray()) {
            a[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            a[c - 'a']--;
        }
        for (int n : a) {
            if (n != 0) return false;
        }
        return true;
    }
}
