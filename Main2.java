import java.util.HashMap;

class Main2 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
            }
            else {
                hashMap.put(nums[i],1 );
            }
        }
        for (Integer i : hashMap.keySet()) {
            System.out.println("key: " + i + " contains value: " + hashMap.get(i));
            if(hashMap.get(i) == 1){

            }
        }
    }
}
