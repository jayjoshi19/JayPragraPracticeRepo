package feb15.function;

import feb15.Employee;

import java.util.function.Function;

public class FunctionService {

    public void displayData(Employee employee, Function<Employee, Integer> function) {
        function.apply(employee);
    }
}
