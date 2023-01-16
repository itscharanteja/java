import java.io.*;
import java.util.Scanner;

public class TextCounter {
    public static void main(String[] args) {
        // Open the text file
        File file = new File("text.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        // Initialize counters
        int lineCount = 0;
        int charCount = 0;
        int wordCount = 0;

        // Read the file line by line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineCount++;
            charCount += line.length();
            wordCount += line.split("\\s+").length;
        }

        // Close the scanner
        scanner.close();

        // Print the results
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
    }
}
