package basic_learn.know_basic_maths;

import java.util.Arrays;
import java.util.Scanner;

public class StewardsSupport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] strengths = new int[input];

        for (int i = 0; i < input; i++) {
            strengths[i] = scanner.nextInt();
        }

        Arrays.sort(strengths);

        int supportedStewards = 0;

        for (int i = 1; i < input - 1; i++) {
            if (strengths[i] > strengths[0] && strengths[i] < strengths[input - 1]) {
                supportedStewards++;
            }
        }

        System.out.println(supportedStewards);
    }
}