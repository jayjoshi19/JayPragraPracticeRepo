package feb01.linkedhashset;

// create a list of countries of the world and make sure they are in insertion order

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of countries you want to add : ");
        int count = sc.nextInt();

        System.out.println("Enter the name of countries of the world : ");

        LinkedHashSet<String> countriesSet = new LinkedHashSet<>();
        for (int i = 0; i < count; i++) {

            String input = sc.next();
            countriesSet.add(input);
        }

        System.out.println(countriesSet);*/

        LinkedHashSet<String> countriesSet = new LinkedHashSet<>();
        countriesSet.add(null);
        countriesSet.add("India");
        countriesSet.add("Brazil");
        countriesSet.add("Russia");
        countriesSet.add("China");
        countriesSet.add("Egypt");
        countriesSet.add("Ethiopia");
        countriesSet.add("Indonesia");
        countriesSet.add("Iran");
        countriesSet.add("UAE");
        System.out.println(countriesSet);

//        System.out.println("Reversed Set :");
//        System.out.println(countriesSet.reversed());

        // QUESTION - Applications of HashSet, LinkedHashSet and TreeSet

    }
}
