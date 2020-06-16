package com.codewithmano;

import java.text.NumberFormat;

public class FormattingNumbers{
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234566.98);
        System.out.println(result);
    }
}