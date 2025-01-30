package jan28;

import java.util.ArrayList;
import java.util.List;

public class TraversalDemo {

    public static void main(String[] args) {

        /*List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);*/

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Blueberry");
        fruits.add("Cherry");
        fruits.add("Grapes");

        // Traversing using simple for loop
        for (int i = 0; i < fruits.size(); i++) {
           // System.out.println(fruits.get(i));
        }

        // Traversing using Advanced for loop
        for (String data : fruits) {
            System.out.println(data);
        }
    }
}
