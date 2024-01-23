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
        int[] nums = {1,2,2};
        Arrays.sort(nums);
        int target =2;
        ArrayList<Integer> fal = new ArrayList<>();
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
                fal.add(m);
                t++;
            }
            if(nums[m] < target){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }

        Collections.sort(fal);

        System.out.println();
        System.out.println();
        for (int j : fal) {
            System.out.println(j + " ");
        }

    }
}
class Solution3 {

    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        ArrayList<Integer> arrayList = new ArrayList<>();
        int t =0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].toCharArray().equals(x)){
                arrayList.add(i);
                t++;
            }
        }




    }
}
class Solution4 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        String s = "a";

        if(s.length() != words.size()){
            return;
        }

        for (int i = 0; i < s.length(); i++) {
                if(!words.get(i).startsWith(String.valueOf(s.charAt(i)))){
                    System.out.println(false);
                    return;
                }
        }




    }
}
