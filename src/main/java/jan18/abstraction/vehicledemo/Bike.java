package jan18.abstraction.vehicledemo;

public class Bike extends Vehicle{
    @Override
    public void brake() {
        System.out.println("Bike is braking...");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating...");
    }

    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
}
