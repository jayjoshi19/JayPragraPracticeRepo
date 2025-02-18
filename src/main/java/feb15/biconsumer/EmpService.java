package feb15.biconsumer;

import feb15.Employee;

import java.util.function.BiConsumer;

public class EmpService {

    public void compareSalary(Employee employee1, Employee employee2, BiConsumer<Employee, Employee> biConsumer) {
        biConsumer.accept(employee1, employee2);
    }
}
