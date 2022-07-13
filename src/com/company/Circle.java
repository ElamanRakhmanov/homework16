package com.company;
/*Circle деген класс тузунуз, анын PI деген свойствасы, area
жана circumference деген статик методдору болсун.
areaны табуу учун: PI * (radius * radius)
circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат*/

public class Circle {
    private double pi = 3.14;


    static void area(){
        double area;
        double radius = 10.123;
        area = 3.14 * (radius * radius);
        System.out.println(area);
    }
    static void circumference(){
        double circumference;
        double radius = 10.123;
        circumference = 3.14 * 2 * radius;
        System.out.println(circumference);
    }

}
