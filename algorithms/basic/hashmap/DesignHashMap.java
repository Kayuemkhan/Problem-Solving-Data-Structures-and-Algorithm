package algorithms.basic.hashmap;

import java.util.HashMap;

public class DesignHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put(3,3);

        //print HashMap
        System.out.println(hashMap);

        // get item number 2
        System.out.println(hashMap.get(2));

        hashMap.remove(2);

        System.out.println(hashMap.get(2));

        // Print keys
        for (Integer i : hashMap.keySet()) {
            System.out.println(i);
        }
        System.out.println();

        // Print values
        for (Integer i : hashMap.values()) {
            System.out.println(i);
        }

        System.out.println();
        for (Integer i : hashMap.keySet()) {
            System.out.println("key: " + i + " contains value: " + hashMap.get(i));
        }

    }
}
