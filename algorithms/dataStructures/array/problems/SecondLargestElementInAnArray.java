package algorithms.dataStructures.array.problems;

import java.util.Arrays;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }

    private static int getSecondLargest(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }

        return -1;
    }
}

// notes : why we using the loop:

/*

If the array contains duplicates of the largest value, then:

arr[n - 1] = largest

arr[n - 2] = could also be the same largest, not the second largest

Example:

arr = [5, 5, 5, 3]
Sorted = [3, 5, 5, 5]

arr[n-2] = arr[2] = 5  // WRONG → second largest is 3


Your method would incorrectly return 5.

This is exactly why the loop exists:
to skip duplicate largest elements and find the next distinct value.

Another failure scenario: All values same
arr = [7, 7, 7]
Sorted = [7, 7, 7]

arr[n-2] = 7   // WRONG → no second largest exists
Should return: -1

Third failure: Only 1 unique number
arr = [10, 10, 9]
Sorted = [9, 10, 10]

arr[n-2] = 10  // WRONG → second largest is 9

 */