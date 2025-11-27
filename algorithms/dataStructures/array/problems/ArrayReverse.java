package algorithms.dataStructures.array.problems;

// [Expected Approach - 1] Using Two Pointers - O(n) Time and O(1) Space\


public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void reverseArray(int[] arr) {
        int i =0, j= arr.length-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
