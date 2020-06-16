package com.codewithmano;

import java.util.Arrays;

public class arrays{
    public static void main(String[] args){

        /* Old method */

//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//
//        System.out.println(Arrays.toString(numbers));

        /* New Method for array*/

        int[] numbers = {1,2,5,3,4};
        Arrays.sort(numbers);

        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));

    }
}