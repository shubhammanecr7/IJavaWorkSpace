package com.hackerrank;

import java.util.Calendar;

public class DateToDay {
    public static void main(String[] args) {

        int month = 1;
        int day = 21;
        int year = 2024;

        String dayString = findDay(month,day,year);
        System.out.println("on given date day is : "+dayString);
    }

    private static String findDay(int month, int day, int year) {
        String[] dayOfWeek = {"SUNDAY","MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        int dayIndex = calendar.get(Calendar.DAY_OF_WEEK);

        return dayOfWeek[dayIndex-1];
    }
}
