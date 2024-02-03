package com.number;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+"--"+b);

        // Different ways to swap two numbers we can use any one of this
        //1 - using temp variable
        int temp = a;
        a = b;
        b = temp;

        //2 - using +,- operator
        a = a + b;  // 10+20=30
        b = a - b;  // 30-20=10
        a = a - b;  //30-10=20

        //3 - using *,/ operator
        a = a * b;
        b = a / b;
        a = a / b;

        //4 - using ^ operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        //5 - single statement
        // b = (10+20) - ( a = 20) -> 30 - 20 now a=20 and b=10
        b = (a + b) - ((a = b));  //this will execute from right to left

        System.out.println(a+"--"+b);
    }
}