package algorithms.basic.set;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Set {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        HashSet<Integer> set = IntStream.of(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        System.out.println(set.size());


    }
}
