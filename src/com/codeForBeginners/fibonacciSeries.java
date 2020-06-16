package com.codeForBeginners;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args){
        // 0
        // 1
        // 0 + 1 = 1
        // 1 + 1 = 2
        // 1 + 2 = 3
        // 2 + 3 = 5
        // 3 + 5 = 8

        int a = 0;
        int b = 0;
        int c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the loop value: ");
        int loop = sc.nextInt();
        for(int i = 0; i <= loop; i++){
//            System.out.println("loop: " +i);
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }
    }
}
