package com.codewithmano;

import java.awt.*;

public class MoreReferenceDataType {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        System.out.println(point1);
        Point point2 = point1;
        point1.x = 4;
        point2.y = 10;
        System.out.println(point2);
        System.out.println("rerun point1 variable: " + point1);
    }
}