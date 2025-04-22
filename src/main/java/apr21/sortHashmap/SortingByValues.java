package apr21.sortHashmap;

import java.util.*;

public class SortingByValues {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 10);
        map.put("Apple", 20);
        map.put("Cherry", 30);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // natural sorting
        list.sort(Map.Entry.comparingByValue());

        // reverse sorting --> pass a comparator inside the method that reverses the order
        //list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        list.forEach(System.out::println);

    }
}
