package feb15.consumer;

import feb15.Employee;

import java.util.function.Consumer;

public class EmployeeService {

    public void printDetails(Employee employee, Consumer<Employee> consumer) {
        consumer.accept(employee);
    }

    public void printSalary(Employee employee, Consumer<Employee> consumer){
        consumer.accept(employee);
    }
}
