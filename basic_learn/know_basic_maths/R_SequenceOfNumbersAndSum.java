package basic_learn.know_basic_maths;

import java.util.Scanner;

public class R_SequenceOfNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if ( a <= 0 || b <=0){
                return;
            }
            int min = Math.min(a,b);
            int max = Math.max(a,b);
            int sum =0;
            for (int i = min; i <= max; i++) {
                System.out.print(i+" ");
                sum += i;
            }
            System.out.println("sum ="+sum);
        }

    }
}
