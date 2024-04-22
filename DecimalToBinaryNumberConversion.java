package com.example.lib;

import java.util.Scanner;

public class DecimalToBinaryNumberConversion {
    public static void main(String[] args) {
        int quotient, i = 1, j, dec_num;
        int binary_num[] = new int[100];
        Scanner scnr = new Scanner(System.in);
        System.out.println("Give me a decimal number: ");
        dec_num = scnr.nextInt();
        quotient = dec_num;

        while(quotient != 0){
            binary_num[i++] = quotient % 2;
            quotient = quotient / 2;
        }

        System.out.println("The binary number is: ");
        for (j = i -1; j > 0; j--){
            System.out.println(binary_num[j]);
        }
    }
}
