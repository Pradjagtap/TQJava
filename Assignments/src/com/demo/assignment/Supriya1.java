package com.demo.assignment;

public class Supriya1 {
	 static void rightRotate(int[] arr, int rotations) {
	        int n = arr.length;
	        // Rotate 'rotations' times
	        for (int i = 0; i < rotations; i++) {
	            int last = arr[n - 1];
	            // Shift elements to right by one position
	            for (int j = n - 1; j > 0; j--) {
	                arr[j] = arr[j - 1];
	            }
	            arr[0] = last; // Move last element to the start
	        }
	    }

	    // Function to print an array
	    static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 2};
        int rotations = 1; // Number of rotations

        System.out.println("Original Array:");
        printArray(arr);

        // Right rotate the array
        for(int i=0;i<3;i++) {
        	rightRotate(arr, rotations);

            System.out.println("\nArray after right rotation:");
            printArray(arr);
        }
        
    }

    // Function to right rotate the array by 'rotations' times
   
}