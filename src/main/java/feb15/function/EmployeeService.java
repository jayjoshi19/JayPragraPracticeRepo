package feb15.function;

import feb15.Employee;
import feb15.Student;

import java.util.function.Function;

public class EmployeeService {

    public void printSalary(Employee employee, Function<Employee, Integer> function) {
        // right now we are just applying logic on the data we have manually passed in the Main class
        // we can also call some api to fetch the data
        // fetch the data from db also
        System.out.println(function.apply(employee));
    }

    public Student convertToStudent(Employee employee, Function<Employee, Student> function) {
        return function.apply(employee);
    }
}
