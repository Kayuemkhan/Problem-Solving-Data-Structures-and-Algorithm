import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int min = Math.min(x, y);
            int max = Math.max(x, y);

            System.out.println(min + " " + max);
        }

        scanner.close();
    }
}
