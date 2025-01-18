package jan18.abstraction.animaldemo;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating..");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}
