package interview.top_50_data_structure_Algorithms_and_coding_interview_questions;

public class DuplicateStringChecker {

    public static boolean bruteforce(String[] input) {
        int j =0;
        for (String s : input) {
            if (s.equals(input[j])) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        // Create an array of strings to check for duplicates
        String[] inputArray = { "apple", "banana", "cherry", "apple", "date" };

        // Call the bruteforce method to check for duplicates
        boolean hasDuplicates = bruteforce(inputArray);

        // Print the result
        if (hasDuplicates) {
            System.out.println("The array contains duplicate strings.");
        } else {
            System.out.println("The array does not contain duplicate strings.");
        }
    }
}
