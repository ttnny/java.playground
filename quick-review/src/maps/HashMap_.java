package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ {
    public static void main(String[] args) {
        // Declare
        Map<Integer, String> hashMap = new HashMap<>();

        // Operate
        hashMap.put(9, "Nine");
        hashMap.put(5, "Five");
        hashMap.put(5, "New Five"); // update existing key
        hashMap.get(5);             // {5=New Five}
        hashMap.remove(5);

        System.out.println(hashMap);

        hashMap.entrySet();
        hashMap.keySet();

        hashMap.containsKey(9);
        hashMap.containsValue("Nine");

        // Iterate
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}