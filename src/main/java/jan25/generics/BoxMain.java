package jan25.generics;

public class BoxMain {

    public static void main(String[] args) {

        Box<Double, Double> box = new Box<>(100.0, 50.0);
        box.getDetails();
    }
}
