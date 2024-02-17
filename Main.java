import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[][] multiArr = {
                {1,2,-1},
                {4,-1,6},
                {7,8,9},
        };
        int max =0;
        Set<Integer> cols = new HashSet<>();




        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                if(multiArr[i][j] == -1){
                    cols.add(j);
                }

                if(multiArr[i][j] > max){
                    max = multiArr[i][j];
                }
            }
        }

        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {

                if (cols.contains(j) && multiArr[i][j] ==-1) {
                    multiArr[i][j] = max;
                }
            }
        }

        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j]+" ");
                }
                    System.out.println();
            }
        }
    }

