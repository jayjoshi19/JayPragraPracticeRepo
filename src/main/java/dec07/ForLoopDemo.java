package dec07;

public class ForLoopDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("----------");

        int j = 0;
        for (; j < 5; j++) {
            System.out.println(j);
        }


        // infinite loop
        //for (;;){
            //System.out.println("Test");
        //}
    }
}
