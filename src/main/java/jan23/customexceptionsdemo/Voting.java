package jan23.customexceptionsdemo;

import java.util.Scanner;

public class Voting {

    int age;
    final int votingAge = 18;

    /*public Voting(int age) {
        this.age = age;
    }*/

    public void eligibleToVote() {

        //System.out.println("---Check for Voting---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age for Voting: ");
        age = sc.nextInt();

        if (age < votingAge) {
            System.out.println("Your age : "+age);
            throw new InvalidAgeException("Your age is below " + votingAge + ", not allowed to vote!");
        } else {
            System.out.println("Your age : "+age);
            System.out.println("Congratulations! You are allowed to cast your vote.");
        }
    }
}
