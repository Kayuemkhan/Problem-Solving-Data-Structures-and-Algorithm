package basic_learn.matrix;

import java.util.Arrays;
import java.util.Collections;

public class RotateMatrixBy180Degree {
    public static void main(String[] args) {
        int[][] mat
                = {{5, 4, 7}, {1, 3, 8}, {2, 9, 6}};
        int n = 3;

        System.out.println("Original Matrix:");

        roatedMat(mat, n);
        printMat(mat);
    }

    private static void roatedMat(int[][] mat, int n) {

        int k = 0;
        int[] newArr = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArr[k++] = mat[i][j];
            }
        }
        int[] arrDesc = Arrays.stream(newArr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = arrDesc[k++];
            }
        }

    }

    private static void printMat(int[][] mat) {

        for (int[] ints : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
