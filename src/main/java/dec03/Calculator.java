package dec03;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        char mainInput = 0;
        do {

            System.out.println("*************************");
            System.out.println("Welcome to My Calculator");
            System.out.println("*************************");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. EXIT");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            int num1;
            int num2;
            char input;

            switch (choice) {
                case 1:
                    do {

                        System.out.println("Enter first number: ");
                        num1 = scanner.nextInt();

                        System.out.println("Enter second number: ");
                        num2 = scanner.nextInt();

                        int sum = num1 + num2;
                        System.out.println("Addition is : " + sum);

                        System.out.println("Do you still want to continue with Addition Operation ?");
                        System.out.println("Press Y for Yes, N for No");
                        input = scanner.next().charAt(0);

                    }while (input == 'Y' || input == 'y');

                    break;

                case 2:
                    do {

                        System.out.println("Enter first number: ");
                        num1 = scanner.nextInt();

                        System.out.println("Enter second number: ");
                        num2 = scanner.nextInt();

                        int sub = num1 - num2;
                        System.out.println("Subtraction is : " + sub);

                        System.out.println("Do you still want to continue with Subtraction Operation ?");
                        System.out.println("Press Y for Yes, N for No");
                        input = scanner.next().charAt(0);

                    }while (input == 'Y' || input == 'y');
                    break;

                case 3:
                    do {

                        System.out.println("Enter first number: ");
                        num1 = scanner.nextInt();

                        System.out.println("Enter second number: ");
                        num2 = scanner.nextInt();

                        int multi = num1 * num2;
                        System.out.println("Multiplication is : " + multi);

                        System.out.println("Do you still want to continue with Multiplication Operation ?");
                        System.out.println("Press Y for Yes, N for No");
                        input = scanner.next().charAt(0);

                    }while (input == 'Y' || input == 'y');
                    break;

                case 4:
                    do {

                        System.out.println("Enter first number: ");
                        num1 = scanner.nextInt();

                        System.out.println("Enter second number: ");
                        num2 = scanner.nextInt();

                        int div = num1 / num2;
                        System.out.println("Division is : " + div);

                        System.out.println("Do you still want to continue with Division Operation ?");
                        System.out.println("Press Y for Yes, N for No");
                        input = scanner.next().charAt(0);

                    }while (input == 'Y' || input == 'y');
                    break;

                case 5:
                    do {

                        System.out.println("Enter first number: ");
                        num1 = scanner.nextInt();

                        System.out.println("Enter second number: ");
                        num2 = scanner.nextInt();

                        int mod = num1 % num2;
                        System.out.println("Modulus is : " + mod);

                        System.out.println("Do you still want to continue with Modulus Operation ?");
                        System.out.println("Press Y for Yes, N for No");
                        input = scanner.next().charAt(0);

                    }while (input == 'Y' || input == 'y');
                    break;

                case 0:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect input entered! Please enter choice from the below options.");
                    break;
            }

            System.out.println("Do you want to go back to main menu ?");
            System.out.println("Press Y for Yes, N for No");
            mainInput = scanner.next().charAt(0);


        } while (mainInput == 'y' || mainInput == 'Y');

    }
}
