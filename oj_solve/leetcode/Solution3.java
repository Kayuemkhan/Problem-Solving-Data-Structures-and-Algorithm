package oj_solve.leetcode;

import java.util.Arrays;
import java.util.HashMap;

class Solution3 {

    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] numsCopied = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int inddex =1;


        for (int i : arr) {
            System.out.println(i);
        }
        int[] dataForReturn = numsCopied;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if(i==0){
                hashMap.put(arr[i],inddex++);

            }
            System.out.println("soutt");
            System.out.println(i !=0 && arr[i] != arr[i-1]);
            System.out.println();
            if(i !=0 && arr[i] != arr[i-1]){
                hashMap.put(arr[i],inddex++);

            }

        }
        for (Integer i : hashMap.keySet()) {
            System.out.println("key: "+i+" Value: "+hashMap.get(i));
        }
        inddex=0;
        for (int j : numsCopied ) {
//            System.out.println(hashMap.get(j));
//            System.out.println("J");
//            System.out.println(j);
            dataForReturn[inddex] = hashMap.get(j);
            inddex++;
        }


    }
}