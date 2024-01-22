package oj_solve.leetcode;

import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] array = new int[] {5,7,7,8,8,10};
        int target = 8;
        searchRange(array,target);
        System.out.println(3<1);
    }
    static public int[] searchRange(int[] nums, int target) {

        return nums;
    }
}

class Solution {

    public static void main(String[] args) {
        int[] nums = {2,2};
        int target =2;
        int[] fal = {-1,-1};
        int t=0;
        int l = 0;
        int r= nums.length-1;
        int m ;
        while(l<=r){
            m = l + (r-l) /2 ;

            System.out.println("m");
            System.out.println(m);
            System.out.println(l);
            System.out.println(r);

            if( nums[m] == target ){
                fal[t] = m;
                t++;
            }
            if(nums[m] < target){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        System.out.println();
        System.out.println();

//        if(fal[0] !=-1 && fal[1] ==-1){
//            fal[1] = fal[0];
//        }

        Arrays.sort(fal);
        for (int j : fal) {
            System.out.println(j + " ");
        }

    }
}
class Solution2 {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        Arrays.sort(nums);
        int target =8;
        int[] fal = {-1,-1};
        int t=0;
        int l = 0;
        int r= nums.length-1;
        int m ;

        while(l<=r){
            m = l + (r-l) /2 ;

            System.out.println("m");
            System.out.println(m);
            System.out.println("rNow");
            System.out.println(r);
            System.out.println("lNow");
            System.out.println(l);
            System.out.println("nums[m]");
            System.out.println(nums[m]);

            System.out.println();

            if( nums[m] == target ){
                fal[t] = m;

                t++;
            }
            if(nums[m] < target ){
                l = m+1;
            }
            else if(nums[m] == target && r == nums.length-1){
                l= m+1;
            }

            else{
                r = m-1;
            }

            System.out.println("rThen");
            System.out.println(r);
            System.out.println("lThen");
            System.out.println(l);
            System.out.println();
            System.out.println();
        }

        if(fal[0] !=-1 && fal[1] ==-1){
            fal[1] = fal[0];
        }
        Arrays.sort(fal);
        for (int j : fal) {
            System.out.println(j);
        }

    }
}
class Solution3 {

    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] numsCopied = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int inddex =1;
        for (int i : arr) {
            System.out.println(i);
        }
        int[] dataForReturn = arr;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if(hashMap.containsKey(numsCopied[i])){
                System.out.println("copied");
                System.out.println(numsCopied[i]);
            }

            if(!hashMap.containsKey(numsCopied[i])){
                hashMap.put(arr[i],inddex++);
            }


        }
        for (Integer i : hashMap.keySet()) {
            System.out.println("key: "+i+" Value: "+hashMap.get(i));
        }
        for (int j : numsCopied ) {
            System.out.println(hashMap.get(j));
//            System.out.println("J");
//            System.out.println(j);

        }


    }
}
