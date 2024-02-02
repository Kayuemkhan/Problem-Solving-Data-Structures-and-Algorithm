import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CodeForces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        int[] arr = new int[inputSize];

        for (int i = 0; i < inputSize; i++) {
            arr[i] = scanner.nextInt();
        }

        LinkedHashSet<Integer> hashMap = new LinkedHashSet<>();
        for (int i = inputSize-1; i > 0; i--) {
            System.out.println("forLoopIn");
            System.out.println(arr[i]);
            hashMap.add(arr[i]);
        }
        System.out.println("forLoopOut");

        System.out.println(hashMap.size());

        for (Integer integer : hashMap) {
            System.out.println(integer);
        }
    }
}
