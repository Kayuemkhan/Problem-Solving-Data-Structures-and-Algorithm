import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {
        int[][] nums = new int[3][2];

        System.out.println(nums.length);

        Scanner in = new Scanner(System.in);
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                System.out.print(nums[row] [col]+" ");
            }
            System.out.println();
        }
    }
}
