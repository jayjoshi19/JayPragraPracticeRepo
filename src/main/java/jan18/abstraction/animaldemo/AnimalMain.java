package jan18.abstraction.animaldemo;

public class AnimalMain {

    public static void main(String[] args) {

        Animal dog = new Dog();

        dog.eat();
        dog.makeSound();
        dog.sleep();

        System.out.println();

        Animal tiger = new Tiger();
        tiger.eat();
        tiger.makeSound();
        tiger.sleep();
    }
}
