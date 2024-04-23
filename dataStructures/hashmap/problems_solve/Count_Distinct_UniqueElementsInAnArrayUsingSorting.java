package dataStructures.hashmap.problems_solve;

import java.util.Arrays;
import java.util.HashSet;

public class Count_Distinct_UniqueElementsInAnArrayUsingSorting {
    public static void main(String[] args) {
        int[] nums = {10,10, 20, 20, 10, 30, 30};

        nums = Arrays.stream(nums).sorted().toArray();

        int flag =0;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 1; i < nums.length; i++) {
           if(nums[i] == nums[i-1]){

           }
        }

//        System.out.println(hashSet.size());
    }
}
