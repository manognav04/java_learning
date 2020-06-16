package com.codewithmano;

public class Casting{
    public static void main(String[] args) {
        //implicit casting
        short a = 1;
        int b = a +1;
        System.out.println(b);

        //explicit casting
        double x = 1.1;
//        int y = x + 3;
        int y = (int)x + 3;
        System.out.println(y);
        float z = (float)x + 1;
        System.out.println(z);

        //explicit casting with strings
        String d = "45";
        int e = Integer.parseInt(d) + 3; // Integer is a wrapper class for int primitive type
        System.out.println(e);
        float f = Float.parseFloat(d); //Float is a wrapper class for float primitive type
        System.out.println(f);

        String g = "4.5"; // we can convert float string to either float or double
//        int h = Integer.parseInt(g); we cannot convert float valued string to int
//        System.out.println(h);
        float h = Float.parseFloat(g);
        System.out.println(h);
    }
}