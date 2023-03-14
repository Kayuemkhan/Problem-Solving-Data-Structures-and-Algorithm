package basic.patterns;

public class Pattern_7_Star_Pyramid {
    /*
    Input Format: N = 6
     *
     ***
     *****
     *******
     *********
     ***********


     In this particular pattern, we run the outer loop for N times as we have to print N rows as usual. Now, the question arises what will be the logic behind the inner loop?

     As we can clearly observe that for each row there are some spaces that get printed then some stars and then again some spaces giving it a final pyramidal look.
     For eg: In the first row (i=0) there are 4 spaces, 1 star, then again 4 spaces. In the second row (i=1) there are 3 spaces, 3 stars, then again 3 spaces, so we can
     say that there are N-i-1 spaces, 2*i+1 stars,and then again N-i-1 spaces for each row where i is the row index. We thus simply run 3 inner loops first for printing
     the spaces, then the stars, and then the spaces again.

     */



    public static void main(String[] args) {

        int n=6;
        // This is the outer loop which will loop for the rows.
        for (int i = 0; i < n; i++) {


            // for printing spaces before stars in each row.
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }

            // for printing the stars in each row

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // for printing spaces before stars in each row.
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }


            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
