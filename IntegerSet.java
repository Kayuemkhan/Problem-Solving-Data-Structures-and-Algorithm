import java.math.BigInteger;
import java.util.Arrays;

public class IntegerSet {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        Arrays.sort(nums);
        int val = 2;
        System.out.println(Arrays.toString(nums));
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));

        System.out.println(j);
    }
}
