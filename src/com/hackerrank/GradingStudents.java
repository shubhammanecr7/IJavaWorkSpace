package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        List<Integer> newGrades = gradingStudents(grades);
        System.out.println(newGrades);
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < grades.size(); i++) {
            int mark = grades.get(i);
            if (mark < 38){
                result.add(mark);
            }else {
                int multiple = (mark/5)+1;
                int multipleOf5 = multiple * 5;
                int diff = multipleOf5 - mark ;
                if (diff < 3){
                    result.add(multipleOf5);
                }else{
                    result.add(mark);
                }
            }
        }
        return result;
    }
}
