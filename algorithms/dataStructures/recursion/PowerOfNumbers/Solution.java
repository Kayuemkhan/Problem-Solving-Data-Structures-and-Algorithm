package algorithms.dataStructures.recursion.PowerOfNumbers;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 5, 7, 8, 9};
        printArray(n, arr);

    }

    private static void printArray(int n, int[] arr) {
        if (n / 2 + 1 == n)
            return;
        else {
            System.out.println(arr[arr.length - n] + " " + arr[n - 1]);
            printArray(n - 1, arr);
        }
    }
}
