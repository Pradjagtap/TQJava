package com.demo.assignment;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 8, 9};
        
        // Initialize max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];
        
        // Iterate through the array to find the maximum and minimum values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // Calculate the difference between max and min
        int difference = max - min;
        
        // Output the difference
        System.out.println("Difference between max and min: " + difference);
    }
}
