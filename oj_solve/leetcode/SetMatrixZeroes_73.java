package oj_solve.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMatrixZeroes_73 {
    public static void main(String[] args) {
        int[][] prevArr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for (int i = 0; i < prevArr.length; i++) {
            for (int j = 0; j < prevArr[i].length; j++) {
                if(prevArr[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        Iterator<Integer> itr = rows.iterator();
        Iterator<Integer> itr2 = cols.iterator();


//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        for (int i = 0; i < prevArr.length; i++) {
            for (int j = 0; j < prevArr[i].length; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    prevArr[i][j] = 0;
                }
            }
        }

//        for (int i = 0; i < prevArr.length; i++) {
//            for (int j = 0; j < prevArr[i].length; j++) {
//                System.out.print(prevArr[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}

