package com.codeForBeginners;

public class sampleClass {
    private String name;
    private int age;

    public sampleClass(String name, int age) {
        this.name = name;
        this.age = age;
//        speak();
    }

    public void speak(){
        System.out.println("This is " + name + "I am " +age);
    }
    public int getAge(int y){
        return y;
    }
}
