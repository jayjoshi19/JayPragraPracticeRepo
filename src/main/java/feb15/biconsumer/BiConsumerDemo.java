package feb15.biconsumer;

import feb15.Employee;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {

        EmpService empService = new EmpService();

        Employee employee1 = Employee.builder()
                .fName("Jay")
                .lName("Joshi")
                .salary(288000)
                .build();

        Employee employee2 = Employee.builder()
                .fName("Sachin")
                .lName("Tendulkar")
                .salary(188000)
                .build();

        BiConsumer<Employee, Employee> biConsumer1 = (e1, e2) ->
                System.out.println(e1.getSalary() < e2.getSalary() ?
                        e1.getFName() + " has less salary than " + e2.getFName() :
                        e1.getFName() + " has more salary than " + e2.getFName());
        //biConsumer1.accept(employee1, employee2);
        empService.compareSalary(employee1, employee2, biConsumer1);
    }
}
