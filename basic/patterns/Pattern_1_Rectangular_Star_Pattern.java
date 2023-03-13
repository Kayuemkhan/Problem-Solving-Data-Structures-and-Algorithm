package basic.patterns;

public class Pattern_1_Rectangular_Star_Pattern {
    /*

    problem
    Pattern-1: Rectangular Star Pattern
    Input: N = 6
    Output:
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *


    Rules to solve:
       In this particular problem, we run the outer loop for N times since we have N rows to be printed,
       the inner loop also runs for N times as we have to print N stars in each row. This way we get a rectangular
       star pattern (square) with an equal number of rows and columns.
     */

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
