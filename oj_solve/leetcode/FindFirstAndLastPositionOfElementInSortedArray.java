package oj_solve.leetcode;

import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] array = new int[] {1};
        int target = 1;
        searchRange(array,target);
    }
    public static int[] searchRange(int[] nums, int target) {



        int firstOccurance = getOccurances(nums,target,true);
        System.out.println(firstOccurance);
        if(firstOccurance == -1){
            return new int[]{-1,-1};
        }
        int secondOccurances = getOccurances(nums,target,false);
        return new int[]{firstOccurance,secondOccurances};
    }

    private static int getOccurances(int[] nums, int target, boolean isFirst) {

        int l =0,r = nums.length-1;
        while (l<=r){
            int mid = (l+r)/2;

            if(nums[mid] == target){
                if(isFirst){
                    if(mid == l|| nums[mid-1] != target  ){
                        return mid;
                    }
                    r = mid-1;
                }
                else {
                    if(mid == r || nums[mid+1] != target  ){
                        return mid;
                    }
                    l = mid+1;
                }
            }
            else if(nums [mid] > target ){
                r = mid-1;
            }
            else {
                l = mid+1;
            }

        }
        return -1;

    }
}

