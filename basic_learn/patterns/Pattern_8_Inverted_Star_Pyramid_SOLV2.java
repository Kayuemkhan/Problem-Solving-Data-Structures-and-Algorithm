package basic_learn.patterns;

public class Pattern_8_Inverted_Star_Pyramid_SOLV2 {
    /*
    Input Format: N = 6
    Result:
    ***********
     *********
      *******
       *****
        ***
         *
     */
    
    public static void main(String[] args) {
        int n =6;
        for(int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");;
            }
            for(int j=0; j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
