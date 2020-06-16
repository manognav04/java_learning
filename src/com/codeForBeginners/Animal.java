package com.codeForBeginners;

public class Animal {
    public static void main(String[] args){
        Dog d = new Dog("Bruno", 1);
        Dog y = new Dog("Dexter", 2);
        d.details();
        d.setAge(3);
        d.details();
        y.details();
    }
}
