package algorithms.dataStructures.hashmap;

import java.util.HashMap;

public class DesignHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"Abdul");
        hashMap.put(2,"Baten");
        hashMap.put(3,"Asib");
        hashMap.put(4,"Shuvo");
        hashMap.put(5,"Sahabul");

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
        for (String i : hashMap.values()) {
            System.out.println(i);
        }

        System.out.println();
        for (Integer i : hashMap.keySet()) {
            System.out.println("key: " + i + " contains value: " + hashMap.get(i));
        }


        //printing everything together:

        System.out.println("Printing Everything");

        for (Integer key: hashMap.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + hashMap.get(key));
        }



    }
}
