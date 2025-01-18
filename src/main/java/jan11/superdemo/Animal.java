package jan11.superdemo;

public class Animal {

    String color = "Brown";

    Animal(){
        System.out.println("Animal is created...");
    }

    void show(){
        System.out.println(color);
    }
    void eat(){
        System.out.println("Animal is eating...");
    }

}

class Horse extends Animal {

    String color = "White";

    public Horse() {
        super();  // accessing the super class constructor (which has to be the first line of the current class constructor)
        System.out.println("Horse is created...");
    }

    void show(){
        System.out.println(color);
        System.out.println(super.color);  // accessing super class variable
        super.eat();  // calling immediate super class method
    }


}
