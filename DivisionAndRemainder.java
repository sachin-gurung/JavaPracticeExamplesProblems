package com.example.lib;

import java.util.Scanner;

public class DivisionAndRemainder {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scnr.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scnr.nextInt();

        float division = (float) num1/num2;
        int remainder = num1 % num2;

        System.out.println("The division is: " + division);
        System.out.println("The remainder is: " + remainder);
    }
}