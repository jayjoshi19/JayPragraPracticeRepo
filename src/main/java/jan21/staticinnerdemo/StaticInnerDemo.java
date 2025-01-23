package jan21.staticinnerdemo;

class Student {

    static class Study {

        boolean isReading = true;

        public void read() {
            System.out.println("Student is reading book : " + isReading);
        }
    }
}

public class StaticInnerDemo {
    public static void main(String[] args) {
        Student.Study study = new Student.Study();
        study.read();
    }
}
