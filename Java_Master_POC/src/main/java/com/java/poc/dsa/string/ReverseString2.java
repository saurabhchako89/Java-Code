package com.java.poc.dsa.string;

public class ReverseString2 {

    public static void main(String[] args) {
        String str = "abcd";
        int k = 3;
        System.out.println("Reversed String is : "+reverseStr(str,k));
    }

    public static String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }
}
