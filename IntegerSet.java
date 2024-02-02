import java.math.BigInteger;
import java.util.Arrays;

public class IntegerSet {

    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        StringBuilder sum = new StringBuilder();

        for (int num : nums) {
            sum.append(num);
        }

        BigInteger bigSum = new BigInteger(sum.toString()).add(BigInteger.ONE);

        String sumString = bigSum.toString();

        int[] output = new int[sumString.length()];

        for (int i = 0; i < sumString.length(); i++) {
            output[i] = Character.getNumericValue(sumString.charAt(i));
        }

        System.out.println(Arrays.toString(output));
    }
}
