package com.demo.assignment;

public class ReversePradnya {
    public static void main(String[] args) {
        String s = "Pradnya Jejurkar";
        
        // Split the string into words
        String[] words = s.split("\\s+");
        
        StringBuilder reversedString = new StringBuilder();
        
        // Reverse each word and append it to the reversedString
        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]).reverse();
            reversedString.append(reversedWord);
            
            // Append space if it's not the last word
            if (i != words.length - 1) {
                reversedString.append(" ");
            }
        }
        
        // Output the reversed string
        System.out.println("Reversed String with spaces maintained: " + reversedString.toString());
    }
}