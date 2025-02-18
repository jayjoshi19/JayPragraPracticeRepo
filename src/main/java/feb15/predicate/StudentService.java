package feb15.predicate;

import feb15.Student;

import java.util.function.Predicate;

public class StudentService {

    public void printFullName(Student student, Predicate<Student> predicate){
        if (predicate.test(student)) {
            System.out.println("Not a valid name");
        } else {
            System.out.println("It is a valid name");
        }
    }
}
