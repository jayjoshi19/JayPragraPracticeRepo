package jan25.collectionsdemo;

public class Test {
    public static void main(String[] args) {
//        int x = 5;
//        x++;
//        int y = x++;
//        System.out.println(x + y);


        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str4);

        String text = "Hello, World!";
        System.out.println(text.substring(0, 5));

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
