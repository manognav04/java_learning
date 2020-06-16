package com.codeForBeginners;

public class Dog {

    private String name;
    private int age;

    public Dog(String n, int a){
        this.name = n;
        this.age = a;
    }

    public void details(){
        System.out.println("This is " +name+ "," +age+ " year old");
    }

    public int setAge(int age){
        return this.age = age;
    }
}
