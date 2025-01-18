package jan7.polymorphism.carExample;

public class DieselCar extends Car{

    String brand;
    String model;
    double price;

    public DieselCar(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String printDetails() {
        System.out.println("Diesel car is running...");
        return "Brand : "+brand +"\nModel : " + model + "\nPrice : "+price;
    }
}
