package com.strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "java programming";
        StringBuilder output = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            StringBuilder revWord = new StringBuilder();
            for (int i = word.length()-1 ; i >=0 ; i--) {
                revWord.append(word.charAt(i));
            }

            output.append(revWord.toString()).append(" ");
        }

        System.out.println(output);
    }
}