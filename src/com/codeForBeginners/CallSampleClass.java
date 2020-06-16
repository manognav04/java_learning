package com.codeForBeginners;

import com.codeForBeginners.sampleClass;

public class CallSampleClass {
    public static void main(String[] args){
        sampleClass records = new sampleClass("Ano", 24);
        records.speak();
        records.getAge(24);
    }
}
