package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        float r, area, circum;
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter the Radius of Circle: ");
//        r = s.nextFloat();
//
//        area = (float)(3.14*r*r);
//        circum = (float)(2*3.14*r);
//        System.out.println("\nArea = " +area);
//        System.out.println("Circumference = " +circum);
//        System.out.println("-----------------------------------------");
        Circle circle = new Circle();
        Circle.area();
        Circle.circumference();
    }
}