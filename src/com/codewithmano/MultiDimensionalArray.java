package com.codewithmano;

import java.util.Arrays;

public class MultiDimensionalArray{
    public static void main(String[] args){

        // 2-dimensional array: matrix example
//        int[][] matrix = new int[2][3];
//        matrix[0][0] = 1;
//
//        System.out.println(Arrays.toString(matrix)); //in order to print matrix use deeptoString()
//        System.out.println(Arrays.deepToString(matrix));


        //In simple

        int[][] matrix = {{2,1,3}, {4,6,5}};
        String result = Arrays.deepToString(matrix);

        System.out.println(result);
    }
}