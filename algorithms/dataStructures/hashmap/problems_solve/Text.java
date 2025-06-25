package algorithms.dataStructures.hashmap.problems_solve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("first.text", "kayum");
        hashMap.put("second.text", "abdul");
        hashMap.put("third.text", "kayum");

        HashMap<String, List<String>> hashMap1 = new HashMap<>();

        for (HashMap.Entry<String, String> entry : hashMap.entrySet()) {
            String value = entry.getValue();
            hashMap1.putIfAbsent(value, new ArrayList<>());
            hashMap1.get(value).add(entry.getKey());
        }

        for (HashMap.Entry<String, List<String>> entry : hashMap1.entrySet()) {
            System.out.print("'" + entry.getKey() + "' -> ");
            System.out.println(String.join(",", entry.getValue()));
        }
    }
}
