package com.codeForBeginners;

import java.util.Map;
import java.util.HashMap;
public class hashMapExample{
    public static void main(String[] args){
        String sentence = "Hi Manogna, hope you are doing great!";
        Map m = new HashMap();

        for(char character:sentence.toCharArray()){
            if(m.containsKey(character)){
                int old = (int) m.get(character);
                m.put(character, old+1);
            } else {
                m.put(character, 1);
            }
        }
        m.remove(' ');
        System.out.println("Number of each character: " +m);
    }
}