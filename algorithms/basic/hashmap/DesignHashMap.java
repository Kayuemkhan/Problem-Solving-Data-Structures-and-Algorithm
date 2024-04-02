package algorithms.basic.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DesignHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        hashMap.put(1,10);
        hashMap.put(2,20);
        hashMap.put(3,30);

        //print HashMap
        System.out.println(hashMap);

        // get item number 2
        System.out.println(hashMap.get(2));

        hashMap.remove(2);

        System.out.println(hashMap.get(2));

        System.out.println("Printing Keys");
        // Print keys
        for (Integer i : hashMap.keySet()) {
            System.out.println(i);
        }

        System.out.println("Printing Values:");

        // Print values
        for (Integer i : hashMap.values()) {
            System.out.println(i);
        }

        System.out.println();
        for (Integer i : hashMap.keySet()) {
            System.out.println("key: " + i + " contains value: " + hashMap.get(i));
        }

        for (Map.Entry<Integer, Integer> e : hashMap.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());

    }
}
