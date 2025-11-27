package algorithms.dataStructures.array.problems;

// [Better Approach] By Using sorting - Time O(n*log(n)) and Space O(1)

import java.util.Arrays;

public class MaximumProductOfATriplet {
    public static void main(String[] args) {
        int[] arr = {-10, -3, 5, 6, -20};
        int max = maxProduct(arr);
        System.out.println(max);
    }

    private static int maxProduct(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);


        return Math.max(arr[0] * arr[1] * arr[n - 1],
                arr[n - 1] * arr[n - 2] * arr[n - 3]);    }
}


/*


Inside the logic — intuitively + mathematically

After sorting the array, two possible triplets could produce the maximum product:

1. The three largest positive numbers

These are:

nums[n-1], nums[n-2], nums[n-3]


This handles cases like:

[1,2,3,4] → 4 * 3 * 2 = 24

2. The two smallest (possibly negative) numbers + the largest positive number

These are:

nums[0], nums[1], nums[n-1]


Why?
Because:

Two negative numbers multiply to give a positive number.

When both are large negatives, their product becomes a large positive number.

Multiplying that with the largest positive number can exceed the product of the three largest positives.

Example:

[-10, -10, 5, 2]
Two smallest = -10, -10
Largest = 5

Product = (-10 * -10 * 5) = 500 → much bigger than 5*2*(-10)


 */