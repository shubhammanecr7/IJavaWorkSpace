package com.strings;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "@#$%^Java";
        String result;
        //way1 - replaceAll() method
        result = str.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(result);

    }
}
