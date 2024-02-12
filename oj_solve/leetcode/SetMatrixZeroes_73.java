package oj_solve.leetcode;

public class SetMatrixZeroes_73 {
    public static void main(String[] args) {
        int[][] prevArr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        int k =0,l=0;

        for (int i = 0; i < prevArr.length; i++) {
            for (int j = 0; j < prevArr[i].length; j++) {
                if(prevArr[i][j] == 0){
                    k =i;
                    l = j;
                }
            }
        }

        System.out.println("k "+k);
        System.out.println("l "+l);
        for (int i = 0; i < prevArr.length; i++) {
            for (int j = 0; j < prevArr[i].length; j++) {
                if( i ==k || l ==j){
                    prevArr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < prevArr.length; i++) {
            for (int j = 0; j < prevArr[i].length; j++) {
                System.out.print(prevArr[i][j]);
            }
            System.out.println();
        }

    }
}
