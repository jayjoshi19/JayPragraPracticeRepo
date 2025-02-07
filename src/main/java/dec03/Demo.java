package dec03;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = myObj.nextLine();

        System.out.println("Enter city:");
        String city = myObj.nextLine();


        System.out.println("Enter country:");
        String country = myObj.nextLine();


        // Output
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}
