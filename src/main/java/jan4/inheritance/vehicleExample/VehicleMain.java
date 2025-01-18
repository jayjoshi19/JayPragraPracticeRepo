package jan4.inheritance.vehicleExample;

public class VehicleMain {

    int numberOfWheels;
    String color;
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.honk();
        car.brake();
        car.numberOfWheels = 4;
        car.color = "White";

        MotorBike bike = new MotorBike();
        bike.accelerate();
        bike.honk();
        bike.brake();
        bike.numberOfWheels=3;
        bike.color = "Black";

        Aeroplane aeroplane = new Aeroplane();
        aeroplane.numberOfWheels = 5;
        aeroplane.accelerate();
        aeroplane.honk();
        aeroplane.brake();
        aeroplane.color = "Blue";

        Truck truck = new Truck();
        truck.accelerate();
        truck.honk();
        truck.brake();
        truck.numberOfWheels = 10;
        truck.color="Gray";
    }

    public void accelerate(){
        System.out.println("Accelerating...");
    }

    public void brake(){
        System.out.println("Braking...");
    }

    public void honk(){
        System.out.println("Honking...");
    }
}
