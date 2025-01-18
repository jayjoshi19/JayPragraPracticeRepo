package jan11.superdemo;

public class Person {
    int id;
    String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person{
    double salary;

    public Employee(int id, String name, double salary) {
        super(id, name);  // reusing parent class constructor by calling it using it parameters
        this.salary = salary;
    }

    void display() {
        System.out.println(id + ", " + name + ", " + salary);
    }
}
