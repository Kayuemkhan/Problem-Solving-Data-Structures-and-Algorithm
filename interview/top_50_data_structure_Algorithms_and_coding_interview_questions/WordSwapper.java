package interview.top_50_data_structure_Algorithms_and_coding_interview_questions;

import java.util.Arrays;

public class WordSwapper {
    public static String swapWordInString(String inputString, String wordToReplace, String newWord) {
        // Split the input string into an array of words
        String[] words = inputString.split("\\s+"); // Split by whitespace

        System.out.println(Arrays.toString(words));

        // Iterate through the array of words
        for (int i = 0; i < words.length; i++) {
            // If the current word matches the word to replace, replace it with the new word
            if (words[i].equals(wordToReplace)) {
                words[i] = newWord;
            }
        }

        // Join the array of words back into a single string
        String resultString = String.join(" ", words);

        return resultString;
    }

    public static void main(String[] args) {
        String inputString = "This is a sample string to demonstrate word swapping";
        String wordToReplace = "sample";
        String newWord = "example";
        String result = swapWordInString(inputString, wordToReplace, newWord);
        System.out.println(result);
    }
}
