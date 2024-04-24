package com.example.lib;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the sentence to reverse: ");
        char[] input_string = scnr.nextLine().toCharArray();
        System.out.print("The reversed string is: ");

        for (int i = input_string.length -1; i >= 0; i--){
            System.out.print(input_string[i]);
        }
    }
}
