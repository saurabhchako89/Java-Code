package com.java.poc.algo.string;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfAString {

    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str);
    }

    private static void printPermutations(String str) {
        List<String> strList = new ArrayList<>();
        for(int i = 0; i< str.length(); i++){
            for(int j = i; j < str.length();j++){
                strList.add(str.substring(i,j));
            }
        }
        System.out.println(strList.toString());
    }
}
