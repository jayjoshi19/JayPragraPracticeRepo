package jan7.polymorphism.carExample;

public class CarMain {

    public static void main(String[] args) {

        Car gasolineCar = new GasolineCar("Hyundai", "Elantra", 25000);
        Car gasolineCar2 = new GasolineCar("Hyundai", "Elantra", 25000);
        //gasolineCar.printDetails();

        Car dieselCar = new DieselCar("Ford", "F150", 55000);
        dieselCar.printDetails();

        Car electricCar = new ElectricCar("Tata", "Nexon EV", 45000);
        electricCar.printDetails();

        System.out.println(gasolineCar.hashCode());
        System.out.println(gasolineCar.hashCode());
    }
}
