package com.example.lib;

public class MultiplyCorrespondingElementsOfTwoArraysOfIntegers {
    public static void main(String[] args) {
        int[] first_array = {1,2,3,-4};
        int[] second_array = {5,-6,7,8};
        String result = "";

        for(int i = 0; i < first_array.length; i++){
            result = String.valueOf(first_array[i] * second_array[i]);
            System.out.print(result + " ");
        }
    }
}
