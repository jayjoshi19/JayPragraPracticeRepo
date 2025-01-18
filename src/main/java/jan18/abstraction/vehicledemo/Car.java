package jan18.abstraction.vehicledemo;

public class Car extends Vehicle{
    @Override
    public void brake() {
        System.out.println("Car is braking...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}
