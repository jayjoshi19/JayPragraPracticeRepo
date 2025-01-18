package jan7.polymorphism.carExample;

public class GasolineCar extends Car{

    String brand;
    String model;
    double price;

    public GasolineCar(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String printDetails() {
        System.out.println("Gasoline car is running...");
        return "Brand : "+brand +"\nModel : " + model + "\nPrice : "+price;
    }
}
