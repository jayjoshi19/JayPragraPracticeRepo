package feb18;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(24, 45, 88, 91, 17, 55, 49, 1, 21, 12, 3, 56, 100);
        //Stream<Integer> numsStream = numbers.stream();

        List<Integer> processedNumbers = numbers.stream()
                                                .filter(n -> n % 2 == 0)
                                                .map(n -> n + 1)
                                                .collect(Collectors.toList());
        System.out.println(processedNumbers);

        List<Employee> employees = List.of(
                Employee.builder().fName("Jay").lName("J").salary(123000).build(),
                Employee.builder().fName("Anil").lName("K").salary(112000).build(),
                Employee.builder().fName("Viru").lName("S").salary(108500).build(),
                Employee.builder().fName("Zak").lName("K").salary(132000).build()
        );

        // find the employees whose salary is more than 117000
        // streams are lazy loader - if we don't provide any terminal function, it will not even execute the
        // stream intermediary functions
        // intermediary functions return streams, while terminal functions don't return streams, it will
        // return some kind of collections or similar datasets
        List<Employee> processedEmployees = employees.stream()
                                                    .filter(e -> e.getSalary() > 117000)
                                                    .collect(Collectors.toList());
        System.out.println(processedEmployees);

        employees.stream().map(x -> {
            Employee.builder().fName("XYZ").lName("A").salary(119000).build();
            x.setSalary(200000);
            return x;
        }).collect(Collectors.toList());

        System.out.println("Employees = "+employees);


    }
}
