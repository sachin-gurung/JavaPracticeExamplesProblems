package com.example.lib;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = scnr.nextInt();

        double areaOfCircle = 3.14 * radius * radius;
        double perimeterOfCircle = 2 * 3.14 * radius;

        System.out.println("The area of circle is: " + areaOfCircle);
        System.out.println("The perimeter of circle is: " + perimeterOfCircle);
    }
}
