package jan18.abstraction.vehicledemo;

public class AbstractionMain {

    public static void main(String[] args) {
        
        Vehicle car = new Car();

        car.start();
        car.accelerate();
        car.brake();

        Vehicle bike = new Bike();
        bike.start();
        bike.accelerate();
        bike.brake();
    }
}
