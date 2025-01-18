package jan18.abstraction.animaldemo;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger is eating...");
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger is growling");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping...");
    }
}
