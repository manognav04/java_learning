package com.codeForBeginners;

import java.util.Scanner;

public class StringSlicing {
    public static void main(String[] args){
        // if divisible by 8, print AN
        // if divisible by 16 print ANIM
        // if divisible by 32 print ANIMAL

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if(number % 32 == 0){
            if (number % 16 == 0){
                if(number % 8 == 0){
                    System.out.println("AN");
                } else{
                    System.out.println("ANIM");
                }
            } else {
                System.out.println("ANIMAL");
            }
        }
    }
}
