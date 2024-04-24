package com.example.lib;

import java.util.Scanner;

public class CountStringInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String input_string = scnr.nextLine();
        Count(input_string);
    }

    static void Count(String str){
        int letter = 0;
        int number = 0;
        int space = 0;
        int other = 0;

        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])){
                number++;
            } else if (Character.isSpaceChar(ch[i])){
                space++;
            } else {
                other++;
            }
        }
        System.out.println("Letters: " + letter);
        System.out.println("Numbers: " + number);
        System.out.println("Space: " + space);
        System.out.println("Others: " + other);
    }
}
