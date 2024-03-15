import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[][] multiArr = {
                {-1, 0, 0, 2, 2},
                {2, 0, 0, 2, 1},
                {4, 3, 2, 1, 1},
                {-1, -1, 0, 2, 4},
                {1, 0, 3, -1, 0}};
        int max = 0;
        Set<Integer> cols = new HashSet<>();
        HashMap<Integer, Integer> maxNum = new HashMap<>();

        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                if (multiArr[i][j] == -1) {
                    System.out.println(" "+j);
                    cols.add(j);
                }

                if (multiArr[i][j] > max) {
                    max = multiArr[i][j];
                    maxNum.put(j, multiArr[i][j]);
                }
            }


        }

        System.out.println(cols);
        System.out.println(maxNum);

        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {

                if (cols.contains(j) && multiArr[i][j] == -1) {
                    multiArr[i][j] = maxNum.get(j) ;
                }
            }
        }


        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j] + " ");
            }

            System.out.println();
        }


    }
}

