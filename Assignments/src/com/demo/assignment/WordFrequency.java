package com.demo.assignment;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	public static void printWordFrequency(String inputString) {
        // Convert input string to lowercase to make the comparison case-insensitive
        inputString = inputString.toLowerCase();
        // Split the input string into words
        String[] words = inputString.split("\\s+");

        // Create a HashMap to store word frequency
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                // If the word is already present in the map, increment its frequency
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                // If the word is encountered for the first time, add it to the map with frequency 1
                wordFrequency.put(word, 1);
            }
        }

        // Print the word frequency
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        String inputString = "Nothing is as easy as it looks Nothing";
        printWordFrequency(inputString);
    }

    
}