package feb04.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jim", 39, 'A'));
        students.add(new Student("Ricardo", 25, 'D'));
        students.add(new Student("Yemane", 58, 'B'));
        students.add(new Student("Randy", 36, 'B'));
        students.add(new Student("Walter", 61, 'C'));
        students.add(new Student("David", 24, 'A'));

        // sorting based on Grade
        System.out.println("Grade based sorting");
        Collections.sort(students, new GradeComparator());
        printList(students);

        System.out.println("-------------------");

        // sorting based on Name
        System.out.println("Name based sorting");
        Collections.sort(students, new NameComparator());
        printList(students);

    }

    public static void printList(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
