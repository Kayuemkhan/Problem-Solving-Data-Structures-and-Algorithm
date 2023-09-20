package basicDS.patterns;

public class Pattern_5_Inverted_Right_Pyramid {
    /*

    Input Format: N = 6
    Result:
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

    Rules:
     In this pattern, we run the outer loop for N times as we have to print N rows and since we have to print a right-angled triangle/pyramid which must be inverted,
     the inner loop will run in decreasing order of stars, for eg: Row 1 (i=0) would contain N stars, Row 2 (i=1) would contain (N -1) stars and so on.
    */

    public static void main(String[] args) {
        for (int i = 6; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
