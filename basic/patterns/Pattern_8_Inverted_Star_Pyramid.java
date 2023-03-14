package basic.patterns;

public class Pattern_8_Inverted_Star_Pyramid {
    public static void main(String[] args) {
        int n =6;

        for (int i = 0; i < n; i++){

            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }


            for(int j=0;j< 2*n -(2*i +1);j++){

                System.out.print("*");
            }

            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }


            System.out.println();
        }
    }
}
