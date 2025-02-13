package feb11.exampleinclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
If we want to use a custom class as a Key in the Map, we have to ---
   1. Make the class immutable - so the object of the class cannot be updated
   2. Must override hashcode() and equals() methods

If the object gets updated/mutated anyhow, then the hashcode will never be the same,
and we can never find the same object ever if any of the object's property is updated.
 */

public class StudentMain {

    public static void main(String[] args) {

        Address addressJay = new Address("123 Main St", "East", "Kitchener", "ON", "N1J2L9");
        Address addressRuchita = new Address("111 King St", "North", "Mississauga", "ON", "M1T2L8");
        Address addressNishva = new Address("222 Queen St", "West", "Brampton", "ON", "L1S2M9");

        Student jay = new Student("Jay", "J", new ArrayList<>(Arrays.asList("121321321")), addressJay);
        Student ruchita = new Student("Ruchita", "K", new ArrayList<>(Arrays.asList("564564654")), addressRuchita);
        Student nishva = new Student("Nishva", "J", new ArrayList<>(Arrays.asList("354564564")), addressNishva);

        Map<Student, Double> gpa = new HashMap<>();
        gpa.put(jay, 3.5);
        gpa.put(ruchita, 3.6);
        gpa.put(nishva, 3.7);

        System.out.println(gpa);

        //System.out.println(nishva.hashCode());
        //nishva.setPhoneNumber("22223335656");

        // this is a way we are allowing to get the actual memory reference of the phoneNumbers list
        // this is how we can let the updates happen to the original object.
        nishva.getPhoneNumbers().add("9090933111");
        //System.out.println(nishva.hashCode());

        Double nishvaGpa = gpa.get(nishva);
        System.out.println("Nishva's gpa is : " + nishvaGpa);
    }
}
