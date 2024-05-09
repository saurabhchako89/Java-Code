package com.java.poc.dsa.blindPracticeList;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
       String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<String> strList = null;
        List<List<String>> finalList = new ArrayList<>();
        Map<String, List<String>> strMap = new HashMap<>();
        StringBuilder sb = null;
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            sb = new StringBuilder();

            for(Character c : chars){
                sb.append(c.toString());
            }

            if(strMap.containsKey(sb.toString())){
                strMap.get(sb.toString()).add(str);
            }else{
                strList = new ArrayList<>();
                strList.add(str);

                strMap.put(sb.toString(),strList);
            }
        }

        for(String key : strMap.keySet()){
            finalList.add(strMap.get(key));
        }

        return finalList;
    }

}
