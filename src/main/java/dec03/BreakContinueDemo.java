package dec03;

public class BreakContinueDemo {

    public static void main(String[] args) {

        // continue - skip the specified iteration based on the condition
        /*System.out.println("Continue demo");
        for (int i = 0; i < 15; i++) {
            if (i == 7) { // here it will skip 7 and print numbers from 8 onwards
                continue;
            }
            System.out.println(i);
        }

        // break - break out of the loop when the condition matches/ is true
        System.out.println("Break demo");
        for (int i = 0; i < 10; i++) {
            if (i == 5) { // as soon as i becomes 5, it will break the loop and print only until 4
                break;
            }
            System.out.println(i);
        }*/

        // print the numbers from 1 - 100
        // skip the multiples of 5
        // 1 2 3 4 Pragra
        // 6 7 8 9 Pragra and so on....

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print("Pragra ");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
