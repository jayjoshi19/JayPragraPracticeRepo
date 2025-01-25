package jan23.customexceptionsdemo;

import java.util.Scanner;

public class DriverLicenceDemo {

    int age;
    final int drivingAge = 16;

    /*public DriverLicenceDemo(int age) {
        this.age = age;
    }*/

    public void eligibleToDrive () {

//        System.out.println("---Check for Driver's Licence---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age Driver's Licence : ");
        age = sc.nextInt();

        // logic to check the age
        // based on the age provided throw InvalidAgeException
        if (age < drivingAge) {
            System.out.println("Your age : "+age);
            throw new InvalidAgeException("Your age is below " + drivingAge + ", not allowed to drive!");
        } else {
            System.out.println("Your age : "+age);
            System.out.println("Congratulations! You can happily drive.\n");
        }
    }
}
