package basic_learn.know_basic_maths;

import java.util.Scanner;

public class V_PUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum=0;
        for (int i = 0; i < n; i++) {
            sum++;
            System.out.print(sum+" ");
            sum++;
            System.out.print(sum+" ");
            sum++;
            System.out.print(sum+" ");
            sum++;

            System.out.println("PUM");

        }

    }
}
