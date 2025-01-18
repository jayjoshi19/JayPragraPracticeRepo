package jan4.inheritance.employee;

public class Employee {
    int id;
    double salary;
    String name;
    int age;
    double numberOfHours;
    double payRate;

    public Employee(int id, String name, int age, double numberOfHours, double payRate) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.age = age;
        this.numberOfHours = numberOfHours;
        this.payRate = payRate;
    }

    public double calculateSalary(){
        return salary;
    }
}
