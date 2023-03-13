package basic.patterns;

public class Pattern_2_Right_Angled_Triangle_Pattern {
    /*
        Problem:
        Input Format: N = 6
        Result:
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        
        Rules to solve:
        In this problem, we run the outer loop for N times as we have to print N rows, and since we have to print a right-angled triangle/pyramid which must be upright,
        the inner loop will run for the row number in each iteration. For eg: 1 star for row 1, 5 stars for row 5, and so on.
                
     */
    public static void main(String[] args) {
        printTriangle(1);
    }

    static void printTriangle(int n) {
        // code here
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
