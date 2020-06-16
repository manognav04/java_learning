package com.codeForBeginners;

public class forLoop{
    public static void main(String[] args){
        int num[] = {2,3,1,4,5,6};
//        System.out.println(num[4]);

        for(int i = 0; i < num.length; i++) {
            if(num[i] == 5){
                System.out.println("Found 6 in index: " +num[i]);
            }
            else{
                System.out.println("Nope");
            }
        }

        for(int element:num){
            System.out.println(element);
        }
    }
}