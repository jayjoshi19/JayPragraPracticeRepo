package feb11.exampleinclass;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ToString
@AllArgsConstructor
@Getter
public final class Student {

    private final String firstName;
    private final String lastName;
    private final List<String> phoneNumbers;
    private final Address address;

    // using this method, we are creating a cloned memory reference of the original one, which will let the dummy/cloned object to be manipulated
    // manipulation cannot be performed on original object by doing so
    // if we still try to use the getPhoneNumbers().add() method to add more phone numbers, new numbers will be added to a new memory reference
    // instead of tampering the original memory reference
    public List<String> getPhoneNumbers() {
        ArrayList<String> clonedPhoneNumbers = new ArrayList<>(phoneNumbers);
        return clonedPhoneNumbers;
        //return new ArrayList<>(phoneNumbers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName)
                && Objects.equals(lastName, student.lastName)
                && Objects.equals(phoneNumbers, student.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNumbers);
    }
}
