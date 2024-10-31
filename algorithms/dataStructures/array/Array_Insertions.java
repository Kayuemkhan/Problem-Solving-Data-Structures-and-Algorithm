package algorithms.dataStructures.array;

import java.util.Arrays;

public class Array_Insertions {
    public static void main(String[] args) {
        int[] intArray = new int[6];
        int length = 0;
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }

    public static class LeetCode217_ContainsDuplicate {
        public static void main(String[] args) {
            int[] nums = {1,2,3,1};
            System.out.println(containsDuplicate(nums));;

        }

        public static boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for(int i=1;i<nums.length;i++){
                if(nums[i-1] == nums[i]){
                    return true;
                }
            }

            return  false;
        }
    }
}
