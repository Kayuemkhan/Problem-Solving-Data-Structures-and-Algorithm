package dataStructures.hashmap.problems_solve;

import java.util.HashSet;

public class Count_Distinct_UniqueElementsInAnArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 30, 10};

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }

        System.out.println(hashSet.size());
    }
}
