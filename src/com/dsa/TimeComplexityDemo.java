package com.dsa;

public class TimeComplexityDemo {
    /*
    * this program is just to demonstrate how two different methods are taking different time to solve the
    * same problem so here we must go with the solution that give us quick result thus,
    * Lesser the time your code takes to perform a task the better it is*/
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println(findSum1(99999));
        System.out.println(STR."Time taken = \{System.currentTimeMillis() - now} miliseconds");
    }

    private static int findSum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    private static int findSum1(int n) {
        return n*(n+1)/2;
    }


}
