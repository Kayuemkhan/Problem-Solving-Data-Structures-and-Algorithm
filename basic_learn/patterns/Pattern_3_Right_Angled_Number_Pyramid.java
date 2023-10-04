package basic_learn.patterns;

public class Pattern_3_Right_Angled_Number_Pyramid {
    /*

    Input Format: N = 6
    Result:
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4 5 6

    Rules: 
    In this pattern, we run the outer loop for N times as we have to print N rows, and since we have to print a right-angled triangle/pyramid which must be upright,
    so the inner loop will run for the row number in each iteration. For eg: 1 number for row 1, 5 numbers for row 5, and so on.
    The only difference between this pattern and pattern 2 is that here we print numbers looping from 1 to the row number for each row instead of printing stars.
     */

    public static void main(String[] args) {
        for (int i = 0; i <=6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1+ " ");
            }
            System.out.println();
        }
    }
}
