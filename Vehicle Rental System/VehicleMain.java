// Interface
interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

// Abstract Class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation (Getters & Setters)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract Method
    public abstract double calculateRentalCost(int days);

    // Display
    public void displayVehicle() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rate per day: " + rentalRate);
    }
}

// Car Class
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // encapsulated

    public Car(String number, double rate, String policy) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10%
    }

    public void getInsuranceDetails() {
        System.out.println("Car Insurance: 10%");
    }
}

// Bike Class
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policy) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5%
    }

    public void getInsuranceDetails() {
        System.out.println("Bike Insurance: 5%");
    }
}

// Truck Class
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String number, double rate, String policy) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 500; // extra charge
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15%
    }

    public void getInsuranceDetails() {
        System.out.println("Truck Insurance: 15%");
    }
}

// Main Class
public class VehicleMain {

    // Polymorphism Method
    public static void processVehicle(Vehicle v, int days) {
        double rentalCost = v.calculateRentalCost(days);
        double insurance = 0;

        if (v instanceof Insurable) {
            insurance = ((Insurable) v).calculateInsurance();
        }

        v.displayVehicle();
        System.out.println("Rental Cost (" + days + " days): " + rentalCost);
        System.out.println("Insurance Cost: " + insurance);
        System.out.println("Total Cost: " + (rentalCost + insurance));
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Vehicle v1 = new Car("DL01", 2000, "C123");
        Vehicle v2 = new Bike("DL02", 500, "B456");
        Vehicle v3 = new Truck("DL03", 4000, "T789");

        Vehicle[] vehicles = {v1, v2, v3};

        int days = 3;

        for (Vehicle v : vehicles) {
            processVehicle(v, days);
        }
    }
}