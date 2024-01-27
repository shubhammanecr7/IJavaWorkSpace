package com.leetcode;

public class StringContainsSubstring {
    public static void main(String[] args) {
        String haystack =  "sadbutsad";
        String needle = "sad";

        int firstOccurence = srtStr(haystack,needle);
        System.out.println(firstOccurence);
    }

    private static int srtStr(String haystack, String needle) {

        for(int i=0 ;i< haystack.length()-needle.length() ;i++) {
            if( haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
