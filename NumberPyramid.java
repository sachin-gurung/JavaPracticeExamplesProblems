package com.example.lib;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int input = scnr.nextInt();

        int space = input + 4 - 1;

        for(int i = 1; i <= input; i++){

            for(int k = space; k != 0; k--){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
            space--;
        }
    }
}
