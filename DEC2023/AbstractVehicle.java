abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class AbstractVehicle {
    public static void main(String[] args) {
        Car cr = new Car();
        Motorcycle mt = new Motorcycle();

        cr.startEngine();
        cr.stopEngine();
        mt.startEngine();
        mt.stopEngine();
    }
}
