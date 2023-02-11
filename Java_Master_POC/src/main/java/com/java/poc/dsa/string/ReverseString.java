package com.java.poc.dsa.string;

import java.util.Arrays;

public class ReverseString {
  public static void main(String[] args) {
    String txt = "hello world";
    System.out.println("original String is : "+txt);
    reverseString(txt.toCharArray());
    reverseString1(txt.toCharArray());
  }

  public static void reverseString(char[] s) {
    for (int i = 0; i < s.length / 2; i++) {
      char temp = s[i];
      s[i] = s[s.length - i - 1];
      s[s.length - i - 1] = temp;
    }
    System.out.println("reversed String 2 is : "+Arrays.toString(s));
  }

  public static void reverseString1(char[] s) {
    int left = 0;
    int right = s.length-1;
    while(left < right){
      char tmp = s[left];
      s[left] = s[right];
      s[right] = tmp;
      left++;
      right--;
    }

    System.out.println("reversed String 3 is : "+Arrays.toString(s));
  }
}
