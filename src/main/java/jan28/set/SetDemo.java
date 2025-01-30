package jan28.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);

        // remove the duplicate number from the list
        set = new HashSet<>(list);
        System.out.println(set);
    }
}
