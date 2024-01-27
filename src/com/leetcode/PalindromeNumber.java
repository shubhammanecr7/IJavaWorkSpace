package com.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 123321;
        boolean isPalindrome = checkPalindrome(num);
        boolean isPalindrome1 = checkPalindrome1(num);
        if (isPalindrome) {
            System.out.println(num + " is palindrome");
        }else {
            System.out.println(num + " is not palindrome");
        }
    }

    private static boolean checkPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num > 0 ){
            int lastDigit = num%10;
            reversedNumber = reversedNumber*10 + lastDigit;
            num = num/10;
        }
        return reversedNumber == originalNumber;
    }

    private static boolean checkPalindrome1(int num) {
        String snum = String.valueOf(num);
        int start =0 ; int end = snum.length()-1;
        while(start<end) {
            if(snum.charAt(start) != snum.charAt(end))
            {
                return false;
            }
            start++; end--;
        }
        return true;
    }
}
