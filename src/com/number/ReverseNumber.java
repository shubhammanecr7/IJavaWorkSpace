package com.number;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        //1. using algorithm (set of instructions to do certain task)
        int rev = 0;
        while (num != 0) {
            rev = rev*10 + num%10;
            num /= 10;
        }
        System.out.println(rev);

        //2. using StringBuffer or  StringBuilder
        System.out.println(new StringBuilder(String.valueOf(num)).reverse());
    }
}