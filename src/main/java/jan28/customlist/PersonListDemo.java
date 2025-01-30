package jan28.customlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonListDemo {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jay", "jay@gmail.com", "123-445-9900", 41));
        persons.add(new Person("Albert", "albert@gmail.com", "212-664-8800", 50));
        persons.add(new Person("Prakash", "prakash@gmail.com", "323-111-9901", 32));
        persons.add(new Person("Ali", "ali@gmail.com", "313-222-9902", 28));

        //System.out.println(persons);

        // find persons having age over 40

        Iterator<Person> iterator = persons.listIterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getAge() > 40) {
                System.out.println(p.getName());
            }
        }
    }
}
