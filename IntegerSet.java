import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class IntegerSet {

    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};

        int start = nums[0];
        int end = nums[0];
        ArrayList < String > x = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {

            if(nums[i]-1 == nums[i-1]){
                end = nums[i];
            }
            else {
                if(start == end){
                    x.add(String.valueOf(end));
                }
                else {
                    x.add(start+"->"+end);
                    start = nums[i];
                    end = nums[i];
                }

                System.out.println("start");
                System.out.println(start);
                System.out.println("end");
                System.out.println(end);

            }
            if(i == nums.length-1){
                if(start == end){
                    x.add(String.valueOf(end));
                }
                else {
                    x.add(start+"->"+end);
                }
            }

        }
        System.out.println(x);

    }
}
