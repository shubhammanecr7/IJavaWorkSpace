package com.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        NumberFormat usaFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chiFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fraFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat indFormat = NumberFormat.getCurrencyInstance(new Locale("en","in"));

        String us = usaFormat.format(payment);
        String india = indFormat.format(payment);
        String china = chiFormat.format(payment);
        String france = fraFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }


}
