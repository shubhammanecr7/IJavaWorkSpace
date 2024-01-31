package com.strings;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String str = "  s sdg  hdf     th";

        String result = str.replaceAll("\\s","");
        System.out.println(result);
    }
}
