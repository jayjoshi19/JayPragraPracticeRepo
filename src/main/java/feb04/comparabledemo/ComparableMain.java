package feb04.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

    public static void main(String[] args) {

        Employee e1 = new Employee("John", 25);
        Employee e2 = new Employee("Shaun", 44);
        Employee e3 = new Employee("Peter", 19);
        Employee e4 = new Employee("Nick", 29);
        Employee e5 = new Employee("Dwyane", 52);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println("Employee list before sorting");
        printList(employeeList);

        Collections.sort(employeeList);
        System.out.println("\nEmployee list after sorting");
        printList(employeeList);

    }

    public static void printList(List<Employee> employeeList) {
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
