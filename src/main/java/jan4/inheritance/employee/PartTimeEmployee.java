package jan4.inheritance.employee;

public class PartTimeEmployee extends Employee{

    double hoursWorked = 25;
    double payRate = 17.55;

    public PartTimeEmployee(int id, String name, int age, double numberOfHours, double payRate) {
        super(id, name, age, numberOfHours, payRate);
    }

//    PartTimeEmployee (double hoursWorked, double payRate){
//
//    }

    @Override
    public double calculateSalary(){
        return (hoursWorked * 2) * payRate;
    }

    public void printEmployeeDetails(){
        System.out.println("Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Employment Type : Part Time");
        System.out.println("Pay Rate : " + payRate);
        System.out.println("Hours Worked : " + numberOfHours);
        System.out.println("Salary : " + calculateSalary());
    }

}
