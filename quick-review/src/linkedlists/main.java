package linkedlists;

import java.util.LinkedList;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {
        // Declare
        LinkedList<String> list = new LinkedList<>();

        // Use 1
        list.addFirst("A");
        list.add("B");
        list.add("B"); // allow duplicates
        list.addLast("Z");
        list.add(2, "D");

        System.out.println(list);

        list.remove("D");
        list.removeFirst();
        list.removeLast();

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