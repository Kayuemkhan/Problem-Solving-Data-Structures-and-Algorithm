package basic_learn.know_basic_maths;

import java.util.*;

public class CafeVisit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cafes = new int[n];

        for (int i = 0; i < n; i++) {
            cafes[i] = scanner.nextInt();
        }

        Map<Integer, Integer> lastVisited = new HashMap<>();
        int longestTime = -1;
        int result = -1;

        for (int i = 0; i < n; i++) {
            int cafeIndex = cafes[i];
            int lastVisitIndex = lastVisited.getOrDefault(cafeIndex, -1);
            int timeDifference = i - lastVisitIndex;

            if (timeDifference > longestTime) {
                longestTime = timeDifference;
                result = cafeIndex;
            }

            lastVisited.put(cafeIndex, i);
        }

        System.out.println(result);
    }
}
