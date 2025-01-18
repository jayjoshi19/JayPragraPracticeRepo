package jan4.inheritance.employee;

public class FullTimeEmployee extends Employee {

    int salary = 60000;

    public FullTimeEmployee(int id, String name, int age, double numberOfHours, double payRate) {
        super(id, name, age, numberOfHours, payRate);
    }


    public void printEmployeeDetails(){
        System.out.println("Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Employment Type : Full Time");
        System.out.println("Pay Rate : " + payRate);
        System.out.println("Hours Worked : " + numberOfHours);
        System.out.println("Salary : " + calculateSalary());
    }

    @Override
    public double calculateSalary(){
        return (double) salary/26;
    }
}
