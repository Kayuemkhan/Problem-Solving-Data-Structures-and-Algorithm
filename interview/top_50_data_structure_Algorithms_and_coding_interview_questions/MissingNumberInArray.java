/* Question
How do you find the missing number in a given integer array of 1 to 100?
 */


package interview.top_50_data_structure_Algorithms_and_coding_interview_questions;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {
 
    public static void main(String args[]) {

        // one missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
 
        // two missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
 
        // three missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
 
        // four missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
 
        // Only one missing number in array
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 10);
        System.out.printf("Missing number in array %s is %d %n", 
                           Arrays.toString(iArray), missing);
    }
   /**
    * A general method to find missing values from an integer array in Java.
    * This method will work even if array has more than one missing element.
    */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
 
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
 
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
        Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
 
    }

    private static int getMissingNumber(int[] numbers, int totalCount) {

        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
 
        return expectedSum - actualSum;
    }
 
}


