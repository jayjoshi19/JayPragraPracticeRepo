package jan28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Blueberry");
        fruits.add("Cherry");
        fruits.add("Grapes");

        // Traversing using Iterator
        /*Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        // Traversing using List Iterator
        System.out.println("--------Forward Traverse-------");
        ListIterator<String> listIterator = fruits.listIterator();

        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }
        System.out.println("--------Reverse Traverse-------");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        for (String s : fruits) {
            if (s.contains("rr")) {
                // this will throw concurrent modification exception
                // as list won't allow to manipulate while traversing using for loop
                //fruits.remove(s);
            }
        }

        System.out.println("--------Remove elements containing 'rr' while traversal-------");
        // Removing specific elements while traversal using Iterator
        Iterator<String> fruitsItr = fruits.iterator();
        while (fruitsItr.hasNext()) {
            String str = fruitsItr.next();
            if (str.contains("rr")) {
                fruitsItr.remove();
            }
        }

        System.out.println(fruits);
    }
}
