package com.codewithmano;

import java.util.Scanner;

public class ScannerExample{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Age: ");
        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("I am " + age + " years old" );

        System.out.print("Enter your name: ");
//        String name = scanner.next(); // only prints Manogna instead of Manogna Vadlamudi
        String name = scanner.nextLine();
        System.out.println("My name is " + name);
    }
}