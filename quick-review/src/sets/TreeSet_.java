package sets;

import java.lang.reflect.Array;
import java.util.*;

public class TreeSet_ {
    public static void main(String[] args) {
        // Declare
        Set<Integer> treeSet = new TreeSet<>(); // sorted collection

        // Operate
        treeSet.add(4);
        treeSet.add(4); // no duplicates
        treeSet.add(1);
        treeSet.remove(4);
        treeSet.contains(4);

        System.out.println(treeSet); // sorted

        // Convert Array to TreeSet
        int[] nums = {5, 0, 6, 2, 3};

        for (int item : nums) {
            treeSet.add(item);
        }

        System.out.println(treeSet); // sorted

        // Iterate
        for (int item : treeSet) {
            System.out.println(item);
        }
    }
}