package basic.patterns;

public class Pattern_4_Right_Angled_Number_Pyramid_II {
    /*
     Input Format: N = 6
    Result:
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    6 6 6 6 6 6


    Rules:
    In this pattern, we run the outer loop for N times as we have to print N rows, and since we have to print a right-angled triangle/pyramid which must be upright,
     so the inner loop will run for the row number in each iteration. For eg: 1’s for row 1, 5’s 5 times for row 5, and so on. The only difference between this pattern
      and pattern 2 is that here we print numbers in each row instead of printing stars.

     */

    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
