class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model){
        super(brand);
        this.model = model;
        System.out.println("Car Model: " + model);
    }
}

public class q2 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla");
    }
}
