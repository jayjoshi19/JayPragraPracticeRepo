package jan18.abstraction.animaldemo;

// We are not letting the original class to show all the implementation and hide it from the other classes.
// Rather, the inheriting class provides all the required implementations; hence it's hidden from the outside
// world, which we call client application.

public abstract class Animal {

    int legs;
    String color;
    double weight;
    int speed;

    public abstract void eat();

    public abstract void makeSound();

    public abstract void sleep();
}
