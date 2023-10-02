package contest.Codeforces_Round_898_div4;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine();

            if (a.length() >= 3 && a.charAt(0) == 'a' && a.charAt(1) == 'b' && a.charAt(2) == 'c') {
                System.out.println("YES");
            } else if (a.length() >= 2 && a.charAt(0) == 'a' && (a.charAt(1) == 'b' || a.charAt(1) == 'c')) {
                System.out.println("YES");
            } else if (a.length() >= 2 && a.charAt(0) == 'b' && a.charAt(1) == 'a') {
                System.out.println("YES");
            } else if (a.length() >= 3 && a.charAt(0) == 'c' && a.charAt(2) == 'a') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
