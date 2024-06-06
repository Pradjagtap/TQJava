package com.demo.assignment;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
        ArrayList<String> grades = new ArrayList<>();
        grades.add("A+2");
        grades.add("B+12");
        grades.add("D+4");
        grades.add("DD+5");

        System.out.println(getNumberForGrade(grades, "D")); // Output: 4
        System.out.println(getNumberForGrade(grades, "B")); // Output: 12
        System.out.println(getNumberForGrade(grades, "DD")); // Output: 5
    }

    public static int getNumberForGrade(ArrayList<String> grades, String character) {
        for (String grade : grades) {
            // Split the string by '+' to separate the character and the number
            String[] parts = grade.split("\\+");
            // Check if the character matches the first part of the split string
            if (parts[0].equals(character)) {
                // If matched, return the associated number
                return Integer.parseInt(parts[1]);
            }
        }
        // If no match found, return -1 or throw an exception as per your requirement
        return -1; // Or throw an exception indicating no match found
    }
}