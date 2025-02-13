package algorithms.dataStructures.hashmap.problems_solve;

import java.util.HashMap;

public class CountFrequencyArray {
    public static void main(String[] args) {
        int a[] = {10,5,10,15,10,5};
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if(hashMap.containsKey(a[i])){
                hashMap.put(a[i],hashMap.get(a[i]) +1);
            }
            else {
                hashMap.put(a[i],1);

            }
        }

        for (HashMap.Entry<Integer,Integer> entry : hashMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
