package jan18.aggregation;

// Aggregation is --> HAS-A relationship

public class Employee {

    private int empId;
    private String empName;
    private String email;
    private double salary;

    // Now, instead of doing this way, we can refer to the address class
    //private String address;

    Address address;


    public Employee(int empId, String empName, String email, double salary, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.salary = salary;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("empId=").append(empId);
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
