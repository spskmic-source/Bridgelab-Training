// Interface
interface RentalService {
    void rent();
    void returnVehicle();
}

// Car Class
class Car implements RentalService {

    public void rent() {
        System.out.println("Car rented");
    }

    public void returnVehicle() {
        System.out.println("Car returned");
    }
}

// Bike Class
class Bike implements RentalService {

    public void rent() {
        System.out.println("Bike rented");
    }

    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}

// Bus Class
class Bus implements RentalService {

    public void rent() {
        System.out.println("Bus rented");
    }

    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}

// Main Class
public class RentalMain {

    public static void main(String[] args) {

        // Polymorphism
        RentalService v1 = new Car();
        RentalService v2 = new Bike();
        RentalService v3 = new Bus();

        RentalService[] vehicles = {v1, v2, v3};

        for (RentalService v : vehicles) {
            v.rent();
            v.returnVehicle();
            System.out.println("----------------");
        }
    }
}