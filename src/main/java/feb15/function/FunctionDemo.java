package feb15.function;

import feb15.Employee;

public class FunctionDemo {

    public static void main(String[] args) {

        FunctionService service = new FunctionService();
        Employee employee = Employee.builder()
                .fName("Sachin")
                .lName("Tendulkar")
                .salary(75000)
                .build();
        service.displayData(employee, e -> e.getSalary());
        System.out.println(employee);
    }
}
