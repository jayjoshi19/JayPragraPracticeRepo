package feb01.TreeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(null);
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(60);

        // print the tree set
        System.out.println(ts);

        // size of tree set
        System.out.println(ts.size());

        // descending set
        System.out.println(ts.descendingSet());


        System.out.println(ts.tailSet(30));
        System.out.println(ts.headSet(30));
        System.out.println(ts.headSet(10));

        System.out.println("First : "+ts.first());
        System.out.println("Last : "+ts.last());
        System.out.println("Lower : "+ts.lower(40));
        System.out.println("Higher : "+ts.higher(30));
        System.out.println("Floor : "+ts.floor(20));
        System.out.println("Ceiling : "+ts.ceiling(40));


        // Given an array
        // 1. Find the highest element in the array
        // 2. Find the lowest element in the array
        // 3. Find the second highest element in the array
        // 4. Find the second lowest element in the array

    }
}
