package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        // Declare
        Set<String> hashSet = new HashSet<>();

        // Operate
        hashSet.add("E");
        hashSet.add("E"); // no duplicates
        hashSet.add("A");
        hashSet.contains("E");

        // Convert HashSet to Array
        String[] array = hashSet.toArray(new String[hashSet.size()]);
        System.out.println(Arrays.toString(array));

        // Convert Array to HashSet
        String[] vowels = {"u", "o", "i", "e", "a"};
        hashSet = new HashSet<>(Arrays.asList(vowels));
        System.out.println(hashSet);

        // Iterate
        for (String item : hashSet) {
            System.out.println(item);
        }
    }
}