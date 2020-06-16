package com.codeForBeginners;

public class callingMethod{
    public static void main(String[] args){
        hello("hi", 3);
    }

    public static void hello(String str, int x){
        for(int i = 1; i < x; i++){
            System.out.println("Wooww!! " +str);
        }
    }
}