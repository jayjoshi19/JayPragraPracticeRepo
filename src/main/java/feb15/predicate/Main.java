package feb15.predicate;

import feb15.Student;
import feb15.function.DriveTestDemo;

public class Main {

    public static void main(String[] args) {

//        DriveTestDemo ontDriveTest = new DriveTestDemo();
//        DriveTestDemo mbDriveTest = new DriveTestDemo();
//        DriveTestDemo bcDriveTest = new DriveTestDemo();
//        ontDriveTest.validateLicence(dl -> dl.length() == 15, "J67941234591900");
//        mbDriveTest.validateLicence(dl -> dl.length() == 14, "J6794-12345-91900");
//        bcDriveTest.validateLicence(dl -> dl.length() == 16, "J6794-12345-9190");

        StudentService studentService = new StudentService();
        Student student = Student.builder()
                .fName("Jay")
                .lName("Joshi")
                .build();
        studentService.printFullName(student, s -> s.getFName().length() < 3);
//        System.out.println(student);
    }
}
