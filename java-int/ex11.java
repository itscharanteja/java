import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex11 {
    public static void main(String[] args) {
        // Replace "text.txt" with the path to your text file
        String filePath = "t.txt";

        // Initialize counters
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        // Read the file and count the characters, words, and lines
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Increment the line count
                lineCount++;

                // Split the line into words
                String[] words = line.split(" ");

                // Increment the word count
                wordCount += words.length;

                // Increment the character count
                for (String word : words) {
                    characterCount += word.length();
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Print the results
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}