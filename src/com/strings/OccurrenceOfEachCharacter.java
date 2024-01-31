package com.strings;

import java.util.HashMap;
import java.util.Map;
public class OccurrenceOfEachCharacter {
    /*print all the occurrence of character in given string*/
    public static void main(String[] args) {
        String str = "java";
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(countMap);
    }
}