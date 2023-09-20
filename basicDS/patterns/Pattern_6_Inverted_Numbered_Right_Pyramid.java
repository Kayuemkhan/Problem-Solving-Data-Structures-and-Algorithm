package basicDS.patterns;

public class Pattern_6_Inverted_Numbered_Right_Pyramid {
    /*
    Input Format: N = 6
    Result:
    1 2 3 4 5 6
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

    Rules:
    In this pattern, we run the outer loop for N times as we have to print N rows and since we have to print a right-angled triangle/pyramid which must be inverted,
     so the inner loop will run from 1 to (N-i)th integer in every row till we reach the Nth row where only ‘1’ would be left to get printed. For eg: in the 1st-row numbers from 1 to
     N get printed, in the 2nd-row numbers from 1 to (N-1) get printed, and so on.
     */

    public static void main(String[] args) {
        for (int i = 6; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();

        }
    }
}
