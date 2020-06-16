package com.codewithmano;

import java.util.Scanner;

public class PrimeNumberTwo {
    public static void main(String[] args){
        int num;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        scanner.close();
        for(int i =2; i<= num/2; i++) {
            int temp = num%i;
            if(temp == 0){
                System.out.println("Number is not prime");
                break;
            }
        }
    }
}