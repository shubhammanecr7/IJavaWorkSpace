package com.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    /*print the longest substring without repeating characters*/
    public static void main(String[] args) {
        String str = "abbac";

        String longestSubstring = null;
        int longestSubstringLength = 0;

        Map<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (!map.containsKey(c)) {
                map.put(c, i); // a-0 b-0
            } else {
                i = map.get(c); //we store index for next iteration if c already in map
                map.clear(); //and clear map for next check
            }

            if (map.size() > longestSubstringLength) {
                longestSubstringLength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        System.out.println(longestSubstring);
    }
}