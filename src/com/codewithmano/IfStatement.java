package com.codewithmano;

public class IfStatement{
    public static void main(String[] args){
        int number = 23;
        boolean isNumberGreat;
        if(number >= 30){
            isNumberGreat = true;
            System.out.println("Yes it is!");
        } else {
            System.out.println("Nope!");
        }
    }
}