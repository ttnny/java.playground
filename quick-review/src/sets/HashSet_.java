package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        // Declare
        Set<String> set = new HashSet<>();

        // Operate
        set.add("A");
        set.add("A"); // Not allow duplicates
        set.add("E");
        set.contains("A");

        // Convert set to array
        String[] array = set.toArray(new String[set.size()]);
        System.out.println(Arrays.toString(array));

        // Convert array to set
        String[] vowels = {"a", "e", "i", "o", "u"};
        set = new HashSet<>(Arrays.asList(vowels));
        System.out.println(set);

        // Iterate
        for (String item : set) {
            System.out.println(item);
        }
    }
}