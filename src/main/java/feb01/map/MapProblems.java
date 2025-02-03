package feb01.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProblems {

    public static void main(String[] args) {

        String str = "pragra";
        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Printing Character occurrences : ");
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for (Map.Entry<Character, Integer> entry: entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
