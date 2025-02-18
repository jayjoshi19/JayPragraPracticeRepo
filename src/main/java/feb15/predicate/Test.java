package feb15.predicate;

import java.util.function.Predicate;

public class Test {

    public void validateLicence(Predicate<String> predicate, String dlNum) {
        if (predicate.test(dlNum)) {
            // here we can call a certain API if it matches, or do any meaningful stuff
            System.out.println("Driver Licence is validated");
        } else {
            System.out.println("Driver Licence is not validated");
        }
    }
}
