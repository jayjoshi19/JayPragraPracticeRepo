package dec03;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        System.out.println("Welcome to the Calculator using Switch Case!!!");
        System.out.println("1. Sum");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice.");

        int input = scanner.nextInt();
        double num1;
        double num2;


        switch (input) {
            case 1:
                System.out.println("Enter first number: ");
                num1 = scanner.nextInt();

                System.out.println("Enter second number: ");
                num2 = scanner.nextInt();

                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println("Enter first number: ");
                num1 = scanner.nextInt();

                System.out.println("Enter second number: ");
                num2 = scanner.nextInt();

                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println("Enter first number: ");
                num1 = scanner.nextInt();

                System.out.println("Enter second number: ");
                num2 = scanner.nextInt();

                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println("Enter first number: ");
                num1 = scanner.nextInt();

                System.out.println("Enter second number: ");
                num2 = scanner.nextInt();

                System.out.println(num1 / num2);
                break;
            case 5:
                System.out.println("Enter first number: ");
                num1 = scanner.nextInt();

                System.out.println("Enter second number: ");
                num2 = scanner.nextInt();

                System.out.println(num1 % num2);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Incorrect input! Please enter your choice from above options.");
                break;
        }
    }
}
