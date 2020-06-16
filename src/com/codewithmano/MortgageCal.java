package com.codewithmano;

import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCal{
    public static void main(String[] args){
        // M = P[r((1+r)^n)/((1+r)^n)-1]

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        //print principle value
        System.out.print("Enter Principle value: ");
        int p = scanner.nextInt();
        System.out.println("Principle: " +p);

        //print annual interest rate
        System.out.print("Enter annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        float r = annualInterest / PERCENT / MONTHS_IN_YEAR;
        System.out.println("Annual Interest Rate: " +r);

        //print timeline
        System.out.print("Enter the timeline: ");
        byte numberOfPayments = scanner.nextByte();
        int n = numberOfPayments * MONTHS_IN_YEAR;
        System.out.println("Period: " +n);

        //apply the formula
        double m = p * ( r * (Math.pow(1 + r, n)) / (Math.pow(1 + r, n)) - 1);
        String mortgage = NumberFormat.getCurrencyInstance().format(m);
        System.out.println("Mortgage: " +mortgage);
    }
}