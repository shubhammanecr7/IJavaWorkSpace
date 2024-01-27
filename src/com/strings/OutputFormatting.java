package com.strings;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        // given input:
        // java 100
        // cpp 65
        // python 50
        // expected output:
        //================================
        // java           100
        // cpp            065
        // python         050
        // ================================
        //in java we cam use printf() function to format the output
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n",s1,x);
            /* -15 means 15 spaces on right side (for left side use 15 positive)
            * 03 means 3 digits are generated (if input contain two digit 0 appended)
            * this numbers must be given between % and s/d/f to make effect
            * ex %15s = 15 spaces after string
            *    %04d = make 4-digit number*/
        }
        System.out.println("================================");
    }
}
