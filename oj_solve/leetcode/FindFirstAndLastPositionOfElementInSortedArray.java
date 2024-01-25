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
        int[] arr = {1,2,5,2,3};
        int target = 2;
        Arrays.sort(arr);

        ArrayList<Integer> arrayList = new ArrayList();

        int firstOccurrence = getOccurrences(arr,target,true);
        if(firstOccurrence ==-1){
            arrayList.add(-1);
            arrayList.add(-1);
            System.out.println(arrayList);
        }
        int secondOccurrence = getOccurrences(arr,target,false);
        arrayList.add(firstOccurrence);
        arrayList.add(secondOccurrence);

        System.out.println(arrayList);



    }

    private static int getOccurrences(int[] arr, int target, boolean isFirst) {
        int left =0;
        int right =arr.length;

        while (left <= right){
            int mid =  (left+ right)/2;

            if(arr[mid] == target){
                if(isFirst){
                    if(mid == left || arr[mid-1] != target){
                        return mid;
                    }
                    right = mid-1;
                }
                else {
                    if(mid == right || arr[mid+1] != target){
                        return mid;
                    }
                    left = mid+1;
                }
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
