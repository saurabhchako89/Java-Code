package com.java.poc.dsa.string;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
  public static void main(String[] args) {
    String txt = "hello world";
    System.out.println("original String is : "+txt);
    System.out.println("Reversed String is : "+reverseString(txt.toCharArray()));
    System.out.println("Reversed String is : "+reverseString1(txt.toCharArray()));
    System.out.println("Reversed String is : "+reverseString2("hello"));
  }

  public static String reverseString(char[] s) {
    for (int i = 0; i < s.length / 2; i++) {
      char temp = s[i];
      s[i] = s[s.length - i - 1];
      s[s.length - i - 1] = temp;
    }
    return Arrays.toString(s);
  }

  public static String reverseString1(char[] s) {
    int left = 0;
    int right = s.length-1;
    while(left < right){
      char tmp = s[left];
      s[left] = s[right];
      s[right] = tmp;
      left++;
      right--;
    }

    return Arrays.toString(s);
  }

  public static String reverseString2(String str) {
    Stack<Character> stack = new Stack<>();
    for (char c : str.toCharArray()) {
      stack.push(c);
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }

    return sb.toString();
  }
}
