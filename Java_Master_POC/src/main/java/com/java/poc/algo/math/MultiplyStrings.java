package com.java.poc.algo.math;

public class MultiplyStrings {
    public static void main(String[] args) {
        String n1 = "9";
        String n2 = "8";

        multiplyStrs(n1,n2);
    }

    private static void multiplyStrs(String n1, String n2) {
        char[] num1 = n1.toCharArray();
        char[] num2 = n2.toCharArray();
        int[] intArr = new int[n1.length() + n2.length()];
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int sum = 0;
        for(int i = n1.length() - 1;i >= 0; i--){
            for(int j =  n2.length() - 1;j>=0;j--){
                int tmp = num1[i] * num2[j];
                if(tmp >= 10){
                   carry = carry + tmp/10;
                    sb.append(tmp%10);
                }
            }
        }
    }
}
