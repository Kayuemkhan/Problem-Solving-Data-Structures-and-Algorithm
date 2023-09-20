package basicDS;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i <n ; i++) {
            int input = scanner.nextInt();
            if ( input == 0 ){
                System.out.println("1");
            }
            else {
                long calFact =1;
                for (int j = 1; j <input; j++) {
                    calFact += j * calFact;
                }
                System.out.println(calFact);
            }
        }
    }
}