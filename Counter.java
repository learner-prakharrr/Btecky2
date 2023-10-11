import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counter {
    public static void main(String[] args) {
        // Initialize counts
        int charCount = 0, wordCount = 0, lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\new.txt"))) {
            String currentLine;

            // Read each line
            while ((currentLine = reader.readLine()) != null) {
                lineCount++;

                // Split the line into words
                String[] words = currentLine.split(" ");
                wordCount += words.length;

                // Count characters in each word
                for (String word : words) {
                    charCount += word.length();
                }
            }

            // Print the counts
            System.out.println("Number of characters in file: " + charCount);
            System.out.println("Number of words in file: " + wordCount);
            System.out.println("Number of lines in file: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
