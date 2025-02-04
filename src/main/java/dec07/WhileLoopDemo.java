package dec07;

import java.util.Scanner;

public class WhileLoopDemo {

    static void printTable(){

        System.out.println("Enter a number to print the table");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;

        while (i <= 10) {
            int res = n*i;
            System.out.println(n + " * " + i + " = "+ res);
            i++;
        }
    }

    static void printNumbers(){

        System.out.println("Enter a number until you want to print");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int i = 1;
        while (i <= input){
            System.out.println(i);
            i++;
        }
    }

    static void sumOfNumbers(){

        System.out.println("Enter a number until you want the sum of numbers");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;
        //int n = 10;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of 1 to " + n + " = "+sum);
    }

    public static void main(String[] args) {

        printTable();
        //printNumbers();
        //sumOfNumbers();
    }
}
