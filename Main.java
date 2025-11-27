import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        int i =0;
        int j = 1;
        while(j <= nums.length-1 && i <= nums.length-2){
            if(nums[i] == 0 ){

                if (nums[j] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                }
                j++;
            }
            else {
                i++;
            }
        }

        String intString = Arrays.toString(nums);
        System.out.println(intString);
    }
}