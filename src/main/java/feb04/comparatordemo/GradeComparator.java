package feb04.comparatordemo;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getGrade() - s2.getGrade();
    }
}
