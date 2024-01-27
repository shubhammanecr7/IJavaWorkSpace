package com.strings;

public class CandyCrush {
    public static void main(String[] args) {
        String s = "google"; // google  good
        reduceString(s);
    }

    /**
     * a method to remove the consecutive double characters from string
     * example : good -> gd , goood -> god
     */
    private static void reduceString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length() - 1) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            if (c1 == c2) {
                sb.delete(i, i + 2);
                if (i > 0) i--;
            } else {
                i++;
            }
        }
        System.out.println(sb.toString());
    }
}
