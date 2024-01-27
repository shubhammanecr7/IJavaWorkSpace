package com.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix
{
    public static void main(String[] args) {
//      scan.nextLine(); // consume extra character left by the scan.nextInt() method
        String[] strs = {"flower","flow","flight"};

        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index = 0;
        while (index < s1.length())
            if (s1.charAt(index) == s2.charAt(index)) index++;
            else break;
        return index==0 ? "" : s1.substring(0,index);
    }
}