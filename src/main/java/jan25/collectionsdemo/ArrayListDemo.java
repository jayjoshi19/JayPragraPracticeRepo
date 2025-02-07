package jan25.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        System.out.println("Size of arraylist = "+list.size());


        list.add(10);

        // check the capacity of arraylist

        System.out.println("Size of arraylist = "+list.size());
        list.add(100);
        list.add(50);
        list.add(63);
        list.add(75);
        list.add(9);
        list.add(15);

        List<Integer> list2 = new ArrayList<>();
        list.add(45);
        list.add(120);
        list.add(200);
        list.add(500);
        list.add(80);

        int size = list.size();
        System.out.println("Size of arraylist = "+size);

        // get an element at particular index
        System.out.println("Element at 4th index : "+list.get(4));

        // update value at particular index
        list.set(3, 500);

        // printing the list
        System.out.println("Elements of Arraylist : "+list);

        // getting index of an element
        System.out.println("Index of element 75 : "+list.indexOf(75));

        // removing element at particular index
        list.remove(5);

        System.out.println("Arraylist after removing element 9 at 5th position : "+list);

        Object[] array = list.toArray();
        System.out.println("Arraylist to Array : "+array.length);

        System.out.println("Printing all elements of the Array");
        for (Object o : array) {
            System.out.println(o);
        }

        list.addAll(list2);

        System.out.println("Added second list to original list : "+list);

//        list.addFirst(900);
//
//        list.addLast(9999);
//
//        System.out.println("Elements of Arraylist after addFirst and addLast : "+list);

        List<Integer> list3 = new ArrayList<>();
        list3.add(777);
        list3.add(666);

        list.addAll(2, list3);

        System.out.println("Original list after adding new list at position 2 : "+list);

        list.removeAll(list3);

        System.out.println("After removing whole list 3 : "+list);

        //var x = "wqw";

    }
}
