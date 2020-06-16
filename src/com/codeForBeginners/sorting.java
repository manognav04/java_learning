package com.codeForBeginners;

import java.util.Arrays;
public class sorting {
    public static void main(String[] args){
        int[] numbers = {-8,-5, 8, 3, 98, 0,3};

        Arrays.sort(numbers);
        for(int x: numbers){
            System.out.print(x + ",");
        }
    }
}
