package basic.patterns;

public class Pattern_8_Inverted_Star_Pyramid {
    public static void main(String[] args) {
        int n =6;

        for (int i = n; i > 0; i--) {


            for ( int j = 0; j < n-i-1 ; j++ ) {
                System.out.print(" ");
            }


            for(int j=0;j< 2*i+1;j++){

                System.out.print("*");
            }

            for ( int j = 0; j < n-i-1 ; j++ ) {
                System.out.print(" ");
            }


            System.out.println();
        }
    }
}
