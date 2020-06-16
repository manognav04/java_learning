package com.codewithmano;

import java.util.Scanner;

public class FizzBuzzExercise{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter number: ");

       int number = scanner.nextInt();

       if(number % 5 == 0) {
           if (number % 3 == 0)
               System.out.println("FIZZBUZZ");
           else
               System.out.println("Fizz");
       }
       else if(number % 3 == 0) {
               System.out.println("Buzz");
       }
       else {
           System.out.println(number);
       }
    }
}