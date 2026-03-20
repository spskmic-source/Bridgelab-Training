// Interface
interface GPS {
    void getCurrentLocation();
    void updateLocation(String location);
}

// Abstract Class
abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation (Getters)
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected void setRatePerKm(double rate) {
        this.ratePerKm = rate;
    }

    // Abstract Method
    public abstract double calculateFare(double distance);

    // Concrete Method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}

// Car Class
class Car extends Vehicle implements GPS {
    private String location;

    public Car(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public void getCurrentLocation() {
        System.out.println("Car Location: " + location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

// Bike Class
class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8; // cheaper
    }

    public void getCurrentLocation() {
        System.out.println("Bike Location: " + location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

// Auto Class
class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // base charge
    }

    public void getCurrentLocation() {
        System.out.println("Auto Location: " + location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

// Main Class
public class RideMain {

    // Polymorphism Method
    public static void calculateRide(Vehicle v, double distance) {
        v.getVehicleDetails();

        double fare = v.calculateFare(distance);
        System.out.println("Distance: " + distance);
        System.out.println("Fare: " + fare);

        if (v instanceof GPS) {
            GPS g = (GPS) v;
            g.getCurrentLocation();
        }

        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Vehicle v1 = new Car(1, "Rahul", 15);
        Vehicle v2 = new Bike(2, "Aman", 10);
        Vehicle v3 = new Auto(3, "Ravi", 12);

        // Update locations
        ((GPS) v1).updateLocation("Delhi");
        ((GPS) v2).updateLocation("Noida");
        ((GPS) v3).updateLocation("Gurgaon");

        Vehicle[] vehicles = {v1, v2, v3};

        double distance = 10;

        for (Vehicle v : vehicles) {
            calculateRide(v, distance); // polymorphism
        }
    }
}