package com.codewithmano;

public class Operators{
    public static void main(String[] args){
        // comparision operators: ==, !=, <=, >=
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        // logical operators: &&, ||, !

        boolean hasIncome = true;
        boolean hasFraud = false;
        boolean hasGoodCredit = true;

        System.out.println((hasIncome || hasFraud) && hasGoodCredit);
    }
}