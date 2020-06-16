package com.codeForBeginners;

import java.util.Scanner;
import java.util.Arrays;

public class ForLoopWithBreak{
    public static void main(String[] args){
//        int[] array = {1,2,3,4};
        String[] s = new String[4];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < s.length; i++){
            System.out.println("loop: " +i);
            System.out.print("Input: ");
            String name = sc.nextLine();
            s[i] = name;
        }
        System.out.println(Arrays.toString(s));

        for(String get:s){
            if(get.equals("hello")){
                System.out.println(" You got it!");
                break;
            }
            else{
                System.out.println("Keep going");
            }
        }
    }
}