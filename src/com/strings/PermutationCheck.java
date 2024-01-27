package com.strings;

public class PermutationCheck {
    public static void main(String[] args) {
        String s1 = "xyz";
        String s2 = "zxy";
        System.out.println(checkPermutation(s1,s2));
    }
    private static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] a = new int[256];
        for(int i = 0 ; i<s1.length() ; i++){
            a[s1.charAt(i)]++;
            a[s2.charAt(i)]--;
        }

        for (int i = 0; i < s1.length(); i++)
            if (a[s1.charAt(i)] != 0)
                return false;

        // if all checks passed then return true
        return true;
    }
}