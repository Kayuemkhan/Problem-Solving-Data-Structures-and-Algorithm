package basic_learn.matrix;


/*
    Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given. The task is to find whether element X is present in the matrix or not.

    Examples:

    Input : mat[][] = { {1, 5, 9},
                   {14, 20, 21},
                   {30, 34, 43} }
       x = 14
    Output : YES

    Input : mat[][] = { {1, 5, 9, 11},
                   {14, 20, 21, 26},
                   {30, 34, 43, 50} }
       x = 42
    Output : NO
 */

public class SearchInMatrix {
    public static void main(String[] args) {
        int x = 8;
        int[][] arr = {{0, 6, 8, 9, 11},
                {20, 22, 28, 29, 31},
                {36, 38, 50, 61, 63},
                {64, 66, 100, 122, 128}};

        boolean found = false;
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (ints[j] == x) {
                    found = true;
                    System.out.println("Found");
                }
            }
        }
        if (!found) {

            System.out.println("Not Found");
        }
    }
}
