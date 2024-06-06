package com.files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class FileReading5 {

	void read(File f) throws IOException {
		FileInputStream fs = null;
		//int x;

		fs = new FileInputStream(f);
		BufferedInputStream bs = new BufferedInputStream(fs);
		byte arr[] = new byte[fs.available()];
		byte arr1[] = new byte[fs.available()];
		
		// 2 read method
		bs.read(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print((char) arr[i]);
		}
	}


public class WordIndex {

    public static void main(String[] args) throws IOException {
    	FileReading5  fr5=new FileReading5 ();
		File f5=new File("C:/Users/User/Desktop/MithiPages/Page1.txt");
		fr5.read(f5);
		
		File f1=new File("C:/Users/User/Desktop/MithiPages/Page2.txt");
		 fr5.read(f1);
		 
		File f2=new File("C:/Users/User/Desktop/MithiPages/Page3.txt");
		fr5.read(f2);
	  
		File f3=new File("C:/Users/User/Desktop/MithiPages/exclude-words.txt");
		fr5.read(f3);
		
		File f4=new File("C:/Users/User/Desktop/MithiPages/index.txt");
		fr5.read(f4);
				
//        List<String> pageFiles = Arrays.asList("Page1.txt", "Page2.txt", "Page3.txt");
//        String exclusionFile = "exclude-words.txt";
//        String outputFile = "index.txt";
//        
//        try {
//            Set<String> exclusionWords = readExclusionList(exclusionFile);
//            Map<String, Set<String>> wordIndex = createIndex(pageFiles, exclusionWords);
//            writeIndexToFile(wordIndex, outputFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static Set<String> readExclusionList(String filePath) throws IOException {
//        Set<String> exclusionWords = new HashSet<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                exclusionWords.add(line.trim().toLowerCase());
//            }
//        }
//        return exclusionWords;
//    }
//
//    private static Map<String, Set<String>> createIndex(List<String> filePaths, Set<String> exclusionWords) throws IOException {
//        Map<String, Set<String>> wordIndex = new HashMap<>();
//        
//        for (String filePath : filePaths) {
//            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] words = processText(line).split("\\s+");
//                    for (String word : words) {
//                        if (!exclusionWords.contains(word) && !word.isEmpty()) {
//                            wordIndex.computeIfAbsent(word, k -> new HashSet<>()).add(filePath);
//                        }
//                    }
//                }
//            }
//        }
//        
//        return wordIndex;
//    }
//
//    private static String processText(String text) {
//        text = text.replace('-', ' '); // Replace hyphens with spaces
//        return text.replaceAll("[^a-zA-Z\\s]", "").toLowerCase(); // Remove punctuation and convert to lowercase
//    }
//
//    private static void writeIndexToFile(Map<String, Set<String>> index, String outputFilePath) throws IOException {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
//            index.entrySet().stream()
//                 .sorted(Map.Entry.comparingByKey())
//                 .forEach(entry -> {
//                     try {
//                         writer.write(entry.getKey() + ": " + String.join(", ", entry.getValue()));
//                         writer.newLine();
//                     } catch (IOException e) {
//                         e.printStackTrace();
//                     }
//                 });
//        }
//    }
//}
//}
List<String> pageFiles = Arrays.asList("Page1.txt", "Page2.txt", "Page3.txt");
String exclusionFile = "exclude-words.txt";
String outputFile = "index.txt";

try {
    Map<String, Set<String>> index = createIndex(pageFiles, exclusionFile);
    writeIndexToFile(index, outputFile);
} catch (IOException e) {
    System.err.println("Error processing files: " + e.getMessage());
}
}

private static Map<String, Set<String>> createIndex(List<String> pageFiles, String exclusionFile) throws IOException {
Set<String> exclusionWords = readExclusionList(exclusionFile);
Map<String, Set<String>> wordIndex = new TreeMap<>();

for (String pageFile : pageFiles) {
    List<String> lines = Files.readAllLines(Paths.get(pageFile));
    for (String line : lines) {
        processLine(line, exclusionWords, wordIndex, pageFile);
    }
}

return wordIndex;
}

private static Set<String> readExclusionList(String exclusionFile) throws IOException {
List<String> lines = Files.readAllLines(Paths.get(exclusionFile));
return new HashSet<>(lines);
}

private static void processLine(String line, Set<String> exclusionWords, Map<String, Set<String>> wordIndex, String pageFile) {
line = line.toLowerCase().replaceAll("[^a-z\\s]", " ");
String[] words = line.split("\\s+");

for (String word : words) {
    if (!word.isEmpty() && !exclusionWords.contains(word)) {
        wordIndex.computeIfAbsent(word, k -> new TreeSet<>()).add(pageFile);
    }
}
}

private static void writeIndexToFile(Map<String, Set<String>> index, String outputFile) throws IOException {
try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {
    for (Map.Entry<String, Set<String>> entry : index.entrySet()) {
        writer.write(entry.getKey() + ": " + String.join(", ", entry.getValue()));
        writer.newLine();
    }
}
}
}
}