package dec07;

import java.util.Scanner;

public class FactorialDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find the factorial :");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " = " + fact);
    }
}
