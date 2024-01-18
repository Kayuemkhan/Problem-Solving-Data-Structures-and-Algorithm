package basic_learn.matrix;

import java.util.Arrays;

public class SortTheGivenMatrix {
    public static void main(String[] args) {
        int[][] mat
                = {{5, 4, 7}, {1, 3, 8}, {2, 9, 6}};
        int n = 3;

        System.out.println("Original Matrix:");

        sortMat(mat, n);
        printMat(mat);
    }

    private static void printMat(int[][] mat) {
        for (int[] ints : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }

    private static void sortMat(int[][] mat, int n) {
        int[] newArray = new int[n * n];
        int k = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArray[k++] = mat[i][j];
            }
        }
        Arrays.sort(newArray);
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = newArray[k++];
            }
        }

    }
}
