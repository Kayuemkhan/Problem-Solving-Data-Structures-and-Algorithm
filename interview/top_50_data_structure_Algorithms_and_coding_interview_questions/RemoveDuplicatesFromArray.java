package interview.top_50_data_structure_Algorithms_and_coding_interview_questions;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static String[] removeDuplicates(String[] input) {
        int n = input.length;
        int newSize = 0;

        // Iterate through the array and compare each element with the rest
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the current element is a duplicate
            for (int j = i + 1; j < n; j++) {
                if (input[i].equals(input[j])) {
                    isDuplicate = true;
                    break; // No need to continue checking
                }
            }

            // If it's not a duplicate, keep it in the array
            if (!isDuplicate) {
                input[newSize] = input[i];
                newSize++;
            }
        }

        // Create a new array with the unique elements
        return Arrays.copyOf(input, newSize);
    }

    public static void main(String[] args) {
        // Create an array of strings with duplicates
        String[] inputArray = { "apple", "banana", "cherry", "apple", "date", "banana" };

        // Call the removeDuplicates method to remove duplicates
        String[] uniqueArray = removeDuplicates(inputArray);

        // Print the unique elements
        System.out.println("Unique elements:");
        for (String element : uniqueArray) {
            System.out.println(element);
        }
    }
}
