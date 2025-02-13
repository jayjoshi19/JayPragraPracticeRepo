package feb11.exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString@AllArgsConstructor
public final class Employee {

    private final int empId;
    private final String fName;
    private final String lName;
    private final Address address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId
                && Objects.equals(fName, employee.fName)
                && Objects.equals(lName, employee.lName)
                && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, fName, lName, address);
    }
}
