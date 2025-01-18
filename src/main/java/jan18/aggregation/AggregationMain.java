package jan18.aggregation;

public class AggregationMain {

    public static void main(String[] args) {

        // Earlier when address was not a separate class, and was considered as String variable
//        Employee e1 = new Employee(101, "Jim Carey", "jimcarey@reddifmail.com", 150000.00, "123, Main St E, Waterloo ON, N2L 6H9");
//        Employee e2 = new Employee(101, "David Bautista", "bautistadavid@yahoo.com", 150000.00, "125, South St, Hamilton ON, L2N 6H9");
//        Employee e3 = new Employee(101, "John Cena", "johncenaa@hotmail.com", 150000.00, "325, King St E, Toronto ON, M2K 6H9");


        Address address1 = new Address(123, "Main St E", "Waterloo", "ON", "N2L 6H9", "CA");
        Address address2 = new Address(125, "South St", "Hamilton", "ON", "L2N 6H9", "CA");
        Address address3 = new Address(325, "King St N", "Toronto", "ON", "M2K 6H9", "CA");

        Employee e1 = new Employee(101, "Jim Carey", "jimcarey@reddifmail.com", 150000.00, address1);
        Employee e2 = new Employee(101, "David Bautista", "bautistadavid@yahoo.com", 150000.00, address2);
        Employee e3 = new Employee(101, "John Cena", "johncenaa@hotmail.com", 150000.00, address3);

//        System.out.println(e1);
//        System.out.println(e2);
//        System.out.println(e3);

        Name name1 = new Name("John", "Bob", "Doe");
        Name name2 = new Name("Amit", "Ramesh", "Joshi");
        Name name3 = new Name("Jerry", "Justin", "Arndt");

        Student s1 = new Student(name1, "john@gmail.com", "647-999-7894");
        Student s2 = new Student(name2, "amit@gmail.com", "226-777-1234");
        Student s3 = new Student(name3, "jerry@gmail.com", "348-456-7890");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
