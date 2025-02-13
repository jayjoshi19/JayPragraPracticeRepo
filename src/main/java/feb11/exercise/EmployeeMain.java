package feb11.exercise;


import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {

    public static void main(String[] args) {

        Address emp1Address = new Address("123 Main St", "East", "Kitchener", "ON", "N1J2L9");
        Address emp2Address = new Address("111 King St", "North", "Mississauga", "ON", "M1T2L8");
        Address emp3Address = new Address("222 Queen St", "West", "Brampton", "ON", "L1S2M9");

        Employee emp1 = new Employee(101, "Ajit", "K", emp1Address);
        Employee emp2 = new Employee(102, "Sachin", "T", emp2Address);
        Employee emp3 = new Employee(103, "Anil", "G", emp3Address);

        Map<Employee, Double> empSalary = new HashMap<>();
        empSalary.put(emp1, 55000.88);
        empSalary.put(emp2, 79000.55);
        empSalary.put(emp3, 46000.00);

        System.out.println(empSalary);

        Double emp1Salary = empSalary.get(emp1);
        System.out.println("Salary of employee 1 = " + emp1Salary);

    }
}
