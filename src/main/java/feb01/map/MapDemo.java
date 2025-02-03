package feb01.map;

import java.util.*;


// List of provinces with Walmart
// Ontario - 25
// New Brunswick - 20
// BC - 18
// Alberta - 34
// Québec - 10
// Manitoba - 4

// 1. Find the province with the highest number of Walmart stores
// 2. Find the province with the lowest number of Walmart stores
// 3. List of all provinces
// 4. Find the total number of walmart stores
// 5. Find the average of number of Walmart stores present in the whole country
public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Ontario", 25);
        map.put("New Brunswick", 20);
        map.put("British Columbia", 18);
        map.put("Alberta", 14);
        map.put("Québec", 10);
        map.put("Manitoba", 6);

        //System.out.println(map);

        // 1. list of all the provinces
        Set<String> provinces = map.keySet();
        System.out.println("List of all Provinces : "+provinces);
        Collection<Integer> numberOfWalmarts = map.values();

        // 2. find highest number of walmart stores
        TreeSet<Integer> stores = new TreeSet<>(numberOfWalmarts);

        // Tree set will give the stores in natural sorting order (ascending)
        //System.out.println("\n"+stores);

        // using last() method we will get the maximum/highest value
        System.out.println("\nHighest number of stores : "+stores.last());

        // 3. find lowest/min number of walmart stores
        System.out.println("\nLowest number of stores : "+stores.first());
        //System.out.println(numberOfWalmarts);

        // 4. Find the total number of walmart stores
        int totalStores = 0;
        Iterator<Integer> iterator = numberOfWalmarts.iterator();
        while (iterator.hasNext()) {
            Integer nextVal = iterator.next();
            totalStores += nextVal;
        }
        System.out.println("\nTotal Walmart stores : "+totalStores);

        // 5. Find the average of number of Walmart stores present in the whole country
        int averageStores = totalStores / numberOfWalmarts.size();
        System.out.println("\nAverage Number of Walmarts in the country : "+averageStores);

    }
}
