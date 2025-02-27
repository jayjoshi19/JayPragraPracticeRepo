package feb18;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {

        List<Student> students = List.of(
                Student.builder().fName("Suraj").lName("Khanna").course("Electronics").marks(88).build(),
                Student.builder().fName("Abhinav").lName("Mukund").course("IT").marks(92).build(),
                Student.builder().fName("Sunil").lName("Joshi").course("Computers").marks(85).build(),
                Student.builder().fName("Anil").lName("Kumble").course("Mechanical").marks(85).build(),
                Student.builder().fName("Vaishali").lName("Samant").course("Music").marks(98).build()
        );

        System.out.println(students);

        // map method to update the marks of the students -- deduct 5 from each
        List<Integer> updatedMarks = students.stream().map(s -> s.getMarks()).map(m -> m - 5).collect(Collectors.toList());
        System.out.println(updatedMarks);

        // sorted
        System.out.println("\nSorted Marks data");
        updatedMarks.stream().sorted().forEach(System.out::println);

        System.out.println("\nSorted using Comparator");
        //students.stream().sorted((e1, e2) -> e1.getCourse().compareTo(e2.getCourse())).forEach(System.out::println);

        // the above sorting technique using the Comparator and its compareTo() method can be replaced by
        // Comparator.comparing() method
        students.stream().sorted(Comparator.comparing(Student::getCourse)).map(Student::getCourse).forEach(System.out::println);

        // distinct
        System.out.println("\nDistinct Marks data");
        updatedMarks.stream().distinct().forEachOrdered(System.out::println);

        // count
        System.out.print("\nCount of Students = ");
        long count = students.stream().count();
        System.out.println(count);

        long distinctCount = updatedMarks.stream().distinct().count();
        System.out.println("Count of distinct elements : " + distinctCount);


        // findAny
        System.out.println("\nFind Any student");
        students.stream().filter(s -> s.getMarks() < 90).findAny().ifPresent(System.out::println);


        // findFirst
        System.out.println("\nFind First student");
//        Optional<Student> optionalStudent = students.stream().filter(s -> s.getMarks() < 90).findFirst();
//        System.out.println(optionalStudent.get());
        students.stream().filter(s -> s.getMarks() < 90).findFirst().ifPresent(System.out::println);


        // anyMatch - returns true or false if any match condition matches
        System.out.println("\nAny Match student");
        System.out.println(students.stream().anyMatch(s -> s.getMarks() < 80));


        // allMatch - returns true or false if the condition matches
        System.out.println("\nAll Match student");
        System.out.println(students.stream().allMatch(s -> s.getMarks() > 70));


        // noneMatch
        System.out.println("\nNone Match student");
        System.out.println(students.stream().noneMatch(s -> s.getMarks() < 80));


        // mapToInt


        // mapToDouble


        // skip & limit
        System.out.println("Skip and Limit");
        Stream<Integer> integerStream = Stream.of(11, 4, 45, 1, 8, 79, 22, 5, 6, 99, 61, 34, 145, 254, 112, 20);
        integerStream.skip(2).limit(10).forEach(System.out::println);

    }
}
