package com.codewithmano;

import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        System.out.println("num: " + num);
        scanner.close();
        for(int i = num; i <= 5; i++){
            System.out.println("print i value: " +i);
        }
    }
}