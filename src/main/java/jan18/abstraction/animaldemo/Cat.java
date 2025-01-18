package jan18.abstraction.animaldemo;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating..");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}
