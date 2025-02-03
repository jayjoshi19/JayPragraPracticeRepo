package feb01.TreeSet;


import java.util.*;

// String str1 =  "I am learning Java in Pragra. Today is Java class in Pragra."
// Find the unique elements in the above given String.
public class ProblemSolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str1 = sc.nextLine();

        //String str1 = "I am learning Java in Pragra. Today is Java class in Pragra.";

        //String[] strArray = str1.split(Arrays.toString(str1.split(" ")));
        String[] strArray = str1.split(" ", 0);
        //System.out.println(Arrays.toString(strArray));

        //System.out.println(s);

        // Solution using TreeSet overloaded constructor that accepts Collection
        /*List<String> list = Arrays.asList(strArray);
        TreeSet<String> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);*/


        // Solution using simple for loop
        TreeSet<String> treeSet = new TreeSet<>();
        for (String s : strArray) {
            //System.out.println(s);
            treeSet.add(s);
        }
        System.out.println(treeSet);

        Spliterator<String> spliterator = treeSet.spliterator();
        System.out.println(spliterator);

    }
}
