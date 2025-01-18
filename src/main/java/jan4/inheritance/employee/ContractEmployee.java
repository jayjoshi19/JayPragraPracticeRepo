package jan4.inheritance.employee;

public class ContractEmployee extends Employee{

    double hoursWorked = 40;
    double payRate = 17.55;

    // contract duration is in months
    double contractDuration = 4;

    public ContractEmployee(int id, String name, int age, double numberOfHours, double payRate) {
        super(id, name, age, numberOfHours, payRate);
    }

    public void printEmployeeDetails(){
        System.out.println("Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Employment Type : Contract");
        System.out.println("Pay Rate : " + payRate);
        System.out.println("Hours Worked : " + numberOfHours);
        System.out.println("Salary : " + calculateSalary());
    }
    public double calculateSalary(){
        return (hoursWorked * 2) * payRate;
    }
}
