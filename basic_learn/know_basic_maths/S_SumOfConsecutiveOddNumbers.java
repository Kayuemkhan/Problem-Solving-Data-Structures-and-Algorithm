package basic_learn.know_basic_maths;

import java.util.Scanner;

public class S_SumOfConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int max = Math.max(num1,num2);
            int min = Math.min(num1,num2);
            int ans = 0;

            for (int j = min+1; j <max ; j++) {
                if(j%2 !=0){
                    ans += j;
                }
            }
            System.out.println(ans);
        }

    }
}
