package feb11.exampleinclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private String postalCode;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(addressLine1, address.addressLine1)
                && Objects.equals(addressLine2, address.addressLine2)
                && Objects.equals(city, address.city)
                && Objects.equals(country, address.country)
                && Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, city, country, postalCode);
    }
}
