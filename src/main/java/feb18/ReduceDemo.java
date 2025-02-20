package feb18;

import java.math.BigInteger;
import java.util.List;

public class ReduceDemo {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                Employee.builder().fName("Jay").lName("J").salary(123000).build(),
                Employee.builder().fName("Anil").lName("K").salary(112000).build(),
                Employee.builder().fName("Viru").lName("S").salary(108500).build(),
                Employee.builder().fName("Zak").lName("K").salary(132000).build()
        );

        // get sum of all salaries - using reduce() function
        Integer sum = employees.stream()
                .map(e -> e.getSalary())
                .reduce(0, (e1, e2) -> e1 + e2);
        System.out.println("Sum of Salaries = "+sum);

        // product of salaries
        BigInteger prod = BigInteger.valueOf(employees.stream()
                .map(e -> e.getSalary())
                .reduce(1, (s1, s2) -> s1 * s2));

        System.out.println(prod);
    }
}
