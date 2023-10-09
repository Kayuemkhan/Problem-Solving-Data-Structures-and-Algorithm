package basic_learn.patterns;

import java.util.Scanner;

public class Pattern_9_Diamond_Star_Pattern {
    /*
    Input Format: N = 6
    Result:
         *
        ***
       *****
      *******
     *********
    ***********
    ***********
     *********
      *******
       *****
        ***
         *

     */

    /*

    Approach:

    This pattern is just a mixture of the last two patterns ( erect pyramid and inverted pyramid). Firstly, we will print the erect pyramid and then an inverted pyramid below it.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N=scanner.nextInt();
        star(N);
        inverted(N);
    }

    private static void inverted(int n) {
        for(int i =0;i< n;i++){


            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    private static void star(int n) {
        for(int i =0;i< n;i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i -1; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
