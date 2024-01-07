package basicDS.array;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val =2;
        removeElement(nums,val);
    }
    public static int removeElement(int[] nums, int val) {
        int sum =0,n=-1;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                n = i;
            }
            else if(n!=-1) {
                nums[i] = nums[n];
                n++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        return val;
    }
}