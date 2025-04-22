package apr21;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 1);
        //infiniteStream.limit(10).forEach(System.out::println);

//        peek();

        //charFrequency();
//        findSecondMaxSalary();
//        removeDuplicates();

        groupingBy();
    }

    /*
    word.chars() --> converts the characters of the word into an IntStream
    mapToObj --> creates character stream based in the int stream (each int externally type-casted to char)
    groupingBy() --> groups the data by the parameters passed in it

    --- groupingBy parameters ---
    Function.identity() --> it is used to group each element in the stream by itself (equivalent to x -> x)
    Collectors.counting() --> will count the number of each of the elements that are grouped together
     */

    public static void charFrequency(){
        String word = "banana";

        Map<Character, Long> freqMap = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(freqMap);
    }

    public static void findSecondMaxSalary(){
        List<Integer> salary = Stream.of(4500, 3300, 17000, 15000, 12500, 10000)
                .sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList());
        System.out.println(salary);
    }

    public static void removeDuplicates(){
        List<Integer> salary = Stream.of(4500, 3300, 17000, 3300, 12500, 12500)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(salary);
    }

    public static void peek(){
        List<String> result = Stream.of("one", "two", "three")
                .peek(s -> System.out.println("Before map: " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("After map: " + s))
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void groupingBy(){

        List<String> stringList = List.of("Java", "Python", "MySQL", "Mongo", "Java", "Mongo", "MySQL", "MySQL", "Python", "Java", "C++");

        Map<String, Long> map = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
