package com.codewithmano;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringDataType {
    public static void main(String[] args){
        String message = "   Hello world!  ";
        String name = message;
        System.out.println(name);
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.indexOf("w"));
        System.out.println(message.indexOf("u")); // find index of character that is not present in the given string
        System.out.println(message.replace("w","W")); //characters with in quotations are called arguments
        System.out.println(message.startsWith("H"));
        System.out.println(message);
        System.out.println(message.trim());
        System.out.println(message);
    }
}