package feb15.function;

import feb15.Employee;
import feb15.Student;

public class Main {

    public static void main(String[] args) {

        //DLValidate dlValidate = (dl) -> dl.length() == 15;
        DriveTestDemo ontDriveTest = new DriveTestDemo();
        DriveTestDemo mbDriveTest = new DriveTestDemo();
        DriveTestDemo bcDriveTest = new DriveTestDemo();
        ontDriveTest.validateLicence(dl -> dl.length() == 15, "J67941234591900");
        mbDriveTest.validateLicence(dl -> dl.length() == 14, "J6794-12345-91900");
        bcDriveTest.validateLicence(dl -> dl.length() == 16, "J6794-12345-9190");

        EmployeeService employeeService = new EmployeeService();
        Employee employee = Employee.builder()
                .fName("Jay")
                .lName("Joshi")
                .salary(150000)
                .build();

        employeeService.printSalary(employee, e -> e.getSalary());

        Student student = employeeService.convertToStudent(employee, e -> Student.builder()
                .fName(e.getFName())
                .lName(e.getLName())
                .build());
        System.out.println(student);
    }
}
