import java.util.Arrays;
import java.util.HashMap;

public class CodeForces {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        Arrays.sort(nums);
        int j =1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            System.out.println(nums[i]);
            if(nums[i] == nums[i-1] && i == nums.length-1){
                j++;
                hashMap.put(nums[i],j);

            }
            else if(nums[i] == nums[i-1] ){
                j++;
                hashMap.put(nums[i],j);
            }
            else {
                j=1;
                hashMap.put(nums[i],j);

            }
            System.out.println("J");
            System.out.println(j);
            System.out.println();
        }
        System.out.println("hashMap Print");
        int max =1;
        int number =1;
        for (Integer name : hashMap.keySet()){
            int key = name;
            int value = hashMap.get(name);
            System.out.println("key: " + key+" "+"value: "+value);
            if(value>max){
                max = value;
                number = key;
            }
        }
        System.out.println(number);
    }
}
