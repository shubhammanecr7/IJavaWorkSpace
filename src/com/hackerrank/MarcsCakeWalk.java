package com.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarcsCakeWalk {
    /* determine minimum number of miles marc must walk to maintain his weight */
    public static void main(String[] args) {
        List<Integer> calorie = Arrays.asList(7, 4, 9, 6);
        long minMiles= marcsCakeWalk(calorie);
        System.out.println(minMiles);
    }

    private static long marcsCakeWalk(List<Integer> calorie) {
        long minMiles = 0;
        calorie.sort(Collections.reverseOrder());
        for (int i = 0; i < calorie.size(); i++) {
            minMiles += (long) (Math.pow(2,i) * calorie.get(i));
        }
        return minMiles;
    }
}