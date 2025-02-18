package feb15.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class DriveTestDemo {

    /*public void validateLicence(Predicate<String> predicate, String dlNum) {
        if (predicate.test(dlNum)) {
            // here we can call a certain API if it matches, or do any meaningful stuff
            System.out.println("Driver Licence is validated");
        } else {
            System.out.println("Driver Licence is not validated");
        }
    }*/
    public void validateLicence(Function<String, Boolean> function, String dlNum) {
        if (function.apply(dlNum)) {
            System.out.println("Driver Licence is validated");
        } else {
            System.out.println("Driver Licence is not validated");
        }
    }

}
