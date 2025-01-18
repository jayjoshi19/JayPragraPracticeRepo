package jan4.inheritance.employee;

public class EmployeeManagement {

    public static void main(String[] args) {

        PartTimeEmployee pte = new PartTimeEmployee(101, "Jay", 30, 24.5, 17.75);
        pte.printEmployeeDetails();
        System.out.println("---------------------------------");

        FullTimeEmployee fte = new FullTimeEmployee(50, "Garry", 29, 42, 0);
        fte.printEmployeeDetails();
        System.out.println("---------------------------------");

        ContractEmployee cte = new ContractEmployee(122, "Ajay", 39, 40, 26.75);
        cte.printEmployeeDetails();

    }
}
