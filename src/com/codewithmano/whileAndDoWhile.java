package com.codewithmano;

import java.util.Scanner;

public class whileAndDoWhile {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!(input.equals("quit"))){
         System.out.print("Input: " );
         input = scanner.next().toLowerCase();
        }

        //Do while
        do {
        System.out.print("Input: " );
        input = scanner.next().toLowerCase();
        } while(!(input.equals("quit")));
    }
}