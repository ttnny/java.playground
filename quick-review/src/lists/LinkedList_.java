package lists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class LinkedList_ {
    public static void main(String[] args) {
        // Declare
        List<String> list = new LinkedList<>();

        // Use 1
        list.add("B");
        list.add("B"); // allow duplicates
        list.add(2, "D");
        list.remove("D");
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        // Use 2
        boolean found = list.contains("B");
        System.out.println(found);

        // Use 3
        String item = list.get(1);
        System.out.println(item);

        list.set(1, "C");
        System.out.println(list);

        // Use 4
        ListIterator<String> listIterator = list.listIterator(0);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Use 5
        for (String s : list) {
            System.out.println(s);
        }
    }
}