package jan18.abstraction.vehicledemo;

public abstract class Vehicle {

    String color;
    String model;
    int year;
    double price;

    public abstract void brake();
    public abstract void accelerate();
    public abstract void start();
}
