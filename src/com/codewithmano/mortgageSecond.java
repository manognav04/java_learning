package com.codewithmano;

import java.util.Scanner;
import java.text.NumberFormat;

public class mortgageSecond {
    public static void main(String[] args) {
        // M = P[r((1+r)^n)/((1+r)^n)-1]

        //condition 1: Principal - Enter number between 1k to 1M
        //condition 2: Annual Interest Rate: Enter number > 0 and >= 30
        //condition 3: Period: Enter a value between 1 and 30

        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float annualRate = 0;
        byte numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);
        //Principal
        while(true) {
            System.out.print("Enter Principal value: ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter value between 1K to 1M");
        }

        //Annual Interest Rate
        while(true) {
            System.out.print("Enter annual interest rate: ");
            annualRate = scanner.nextFloat();
            if(annualRate > 0 && annualRate <= 30)
                break;
            System.out.println("Enter value in between 0 and 30");
        }

        float r = annualRate / MONTHS_IN_YEARS / PERCENT;
        System.out.println("Annual Interest Rate: " +r);

        //Number of payments
        while(true){
            System.out.print("Enter numnber of payments: ");
            numberOfPayments= scanner.nextByte();
            if(numberOfPayments > 0 && numberOfPayments <= 30)
                break;
            System.out.println("Enter number of payments in between 0 and 30");
        }
        int n = numberOfPayments * MONTHS_IN_YEARS;
        System.out.println("Periods: " +n);

        double mortgageValue = principal * ((r * Math.pow(1+r, n)) / (Math.pow(1+r, n)) -1 );
        String mortgage = NumberFormat.getCurrencyInstance().format(mortgageValue);
        System.out.println("Mortgage value = " +mortgage);
    }
}