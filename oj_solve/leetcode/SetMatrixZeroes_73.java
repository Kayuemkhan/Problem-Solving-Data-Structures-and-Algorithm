package oj_solve.leetcode;

import java.util.HashMap;
import java.util.Iterator;

public class SetMatrixZeroes_73 {
    public static void main(String[] args) {
        int[][] prevArr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        HashMap<String,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < prevArr.length; i++) {
            for (int j = 0; j < prevArr[i].length; j++) {
                if(prevArr[i][j] == 0){
                    hashMap.put("i",i);
                    hashMap.put("j",j);

                }
            }
        }

        for(String i : hashMap.keySet()){
            System.out.println("key: " + i + " value: " + hashMap.get(i));
        }



        for (int i = 0; i < prevArr.length; i++) {
            for (int j = 0; j < prevArr[i].length; j++) {
                if( hashMap.get("i") == i|| hashMap.get("j") ==i || hashMap.get("j") == j) {
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
