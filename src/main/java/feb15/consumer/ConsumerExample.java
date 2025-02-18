package feb15.consumer;

import feb15.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample{

    public static void main(String[] args) {

        Employee employee1 = Employee.builder()
                .fName("Jay")
                .lName("Joshi")
                .salary(88000)
                .build();

        Employee employee2 = Employee.builder()
                .fName("Sachin")
                .lName("Tendulkar")
                .salary(188000)
                .build();

        Consumer<Employee> consumer1 = employee -> System.out.println(employee.getFName());

        EmployeeService employeeService = new EmployeeService();
        //employeeService.printDetails(employee1, consumer1);
        employeeService.printSalary(employee1, e -> System.out.println(e.getSalary()));


    }
}
