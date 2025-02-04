package dec07.IVRApplication.rogersservices;

import java.util.Scanner;

public class AppServices {

    public void chooseLanguageMenu() {
        System.out.println("***********");
        System.out.println("Welcome to Rogers IVR Simulation");
        System.out.println("***********");

        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice :");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Welcome to English Menu");
        } else if (choice == 2) {
            System.out.println("Welcome to French Menu");
        } else {
            System.out.println("Invalid choice input.");
        }
    }
}
