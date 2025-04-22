package apr21.sortHashmap;

import com.sun.source.tree.Tree;

import java.util.*;

public class SortingByKey {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 2);
        map.put("Apple", 1);
        map.put("Cherry", 3);

        // 1st way is to convert Hashmap to a tree map and get the natural sorted order from Treemap
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        //System.out.println(sortedMap);


        // 2nd way is using Map.Entry interface
        // convert HashMap to List using Map.Entry
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // sort the list using comparator
        list.sort(Map.Entry.comparingByKey());

        // display the sorted list
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
