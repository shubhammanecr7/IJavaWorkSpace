package com.leetcode;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int newI = scan.nextInt();
        double newD = scan.nextDouble();
        scan.nextLine();   // consume extra character left by the scan.nextDouble() method
        String newS = scan.nextLine();
        System.out.println(i+ newI + "");
        System.out.println(d+newD +"");
        System.out.println(s+newS);
        scan.close();
    }
}
