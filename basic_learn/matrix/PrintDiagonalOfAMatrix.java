package basic_learn.matrix;

/*
    Given a 2D square matrix, print the Principal and Secondary diagonals.
    Examples :
    Input:
    1 2 3 4
    4 3 2 1
    7 8 9 6
    6 5 4 3
    Output:
    Principal Diagonal: 1, 3, 9, 3
    Secondary Diagonal: 4, 2, 8, 6
 */
public class PrintDiagonalOfAMatrix {
    public static void main(String[] args) {
        int n = 4;
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        printPrincipalDiagonal(a, n);
        printSecondaryDiagonal(a, n);
    }

    private static void printSecondaryDiagonal(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print(a[i][j]);
                }
            }
            System.out.print("\t");
        }
    }

    private static void printPrincipalDiagonal(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(a[i][j]);
                }
            }
            System.out.print("\t");
        }
        System.out.println();
    }
}
