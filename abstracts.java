abstract class Vehicle {
    // Abstract method
    abstract void start();

    // Concrete method
    void fuelType() {
        System.out.println("Most vehicles use petrol or diesel.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key ignition.");
    }
}
class Bus extends Vehicle {
    void start() {
        System.out.println("Bus starts manually ");
    }
}

public class abstracts {
    public static void main(String[] args) {
        Vehicle v = new Car();  // Abstraction in action
        v.start();
        v.fuelType();
        Vehicle v2 = new Bus();
        v2.start();
        v2.fuelType();
    }
}
