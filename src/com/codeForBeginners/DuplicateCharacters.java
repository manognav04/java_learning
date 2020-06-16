package com.codeForBeginners;

//import java.util.Map;
//import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args){
        String name = "Manogna";
        int count = 0;
        char[] duplicate = name.toCharArray();

        for(int i = 0; i < name.length(); i++)
            for(int j = i+1; j < name.length(); j++){
                if(duplicate[i] == duplicate[j]){
                    System.out.println(duplicate[j]);
//                    count+=1;
                    break;
                }
            }
    }
}
