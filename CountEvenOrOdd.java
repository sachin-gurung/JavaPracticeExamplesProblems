package com.example.lib;

import java.util.Scanner;

public class CountEvenOrOdd {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,10,11,12};
        int even_count = 0;
        int odd_count = 0;

        for(int i = 0; i < input.length; i++){
            if(input[i]%2 == 0){
                even_count++;
            } else{
                odd_count++;
            }
        }
        System.out.println("Even count: " + even_count);
        System.out.println("Odd count: " + odd_count);
    }
}
