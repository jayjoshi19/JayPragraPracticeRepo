package jan11.finaldemo;

public class FinalMain {

    public static void main(String[] args) {
        TestFinal tf = new TestFinal();
        //tf.show();

        B b = new B();
        System.out.println(b.y);
        b.show();
        b.change();

    }
}
