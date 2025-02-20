package feb18;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                Employee.builder()
                        .fName("Jay")
                        .lName("J")
                        .salary(123000)
                        .addresses(List.of(Address.builder().postalCode("A1B2C3").city("Toronto").build(),
                                Address.builder().postalCode("D2S3C9").city("Toronto").build()))
                        .build(),
                Employee.builder()
                        .fName("Anil")
                        .lName("K")
                        .salary(112000)
                        .addresses(List.of(Address.builder().postalCode("C2A1H7").city("Toronto").build(),
                                Address.builder().postalCode("M12GT6").city("Toronto").build()))
                        .build(),
                Employee.builder()
                        .fName("Viru")
                        .lName("S")
                        .salary(108500)
                        .addresses(List.of(Address.builder().postalCode("Z1P2C7").city("Toronto").build(),
                                Address.builder().postalCode("L6N3R5").city("Toronto").build()))
                        .build(),
                Employee.builder()
                        .fName("Zak")
                        .lName("K")
                        .salary(132000)
                        .addresses(List.of(Address.builder().postalCode("G1H2L3").city("Toronto").build(),
                                Address.builder().postalCode("K1G5D9").city("Toronto").build()))
                        .build()
        );

        // get list of all postal codes
        List<String> postalCodes = employees.stream().flatMap(e -> e.getAddresses().stream()).map(a -> a.getPostalCode()).collect(Collectors.toList());
        System.out.println(postalCodes);
    }
}
