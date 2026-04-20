import java.util.*;

// Ride Request Class
class RideRequest implements Comparable<RideRequest> {
    int requestId;
    int priority; // higher value = higher priority

    public RideRequest(int requestId, int priority) {
        this.requestId = requestId;
        this.priority = priority;
    }

    // PriorityQueue sorting (highest priority first)
    @Override
    public int compareTo(RideRequest other) {
        return other.priority - this.priority;
    }

    @Override
    public String toString() {
        return "RequestID: " + requestId + ", Priority: " + priority;
    }
}

// Driver Class
class Driver {
    int driverId;
    String name;

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Driver)) return false;
        Driver d = (Driver) obj;
        return this.driverId == d.driverId;
    }

    @Override
    public String toString() {
        return "DriverID: " + driverId + ", Name: " + name;
    }
}

// Ride Class (Completed rides)
class Ride {
    int rideId;
    Driver driver;
    RideRequest request;

    public Ride(int rideId, Driver driver, RideRequest request) {
        this.rideId = rideId;
        this.driver = driver;
        this.request = request;
    }

    @Override
    public String toString() {
        return "RideID: " + rideId + " | " + driver + " | " + request;
    }
}

// Main System
public class RideSharingSystem {
    public static void main(String[] args) {

        // 1. Queue for normal ride requests
        Queue<RideRequest> requestQueue = new LinkedList<>();
        requestQueue.add(new RideRequest(1, 2));
        requestQueue.add(new RideRequest(2, 1));

        // 4. PriorityQueue for urgent rides
        PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new RideRequest(3, 5)); // high priority
        priorityQueue.add(new RideRequest(4, 3));

        // 2. Set for available drivers
        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver(101, "Amit"));
        drivers.add(new Driver(102, "Ravi"));

        // 3. List for completed rides
        List<Ride> completedRides = new ArrayList<>();

        System.out.println("Assigning Priority Requests First:");

        // Handle priority requests
        while (!priorityQueue.isEmpty() && !drivers.isEmpty()) {
            RideRequest req = priorityQueue.poll();
            Driver driver = drivers.iterator().next();
            drivers.remove(driver);

            Ride ride = new Ride(req.requestId, driver, req);
            completedRides.add(ride);

            System.out.println("Assigned: " + ride);
        }

        System.out.println("\nAssigning Normal Requests:");

        // Handle normal queue
        while (!requestQueue.isEmpty() && !drivers.isEmpty()) {
            RideRequest req = requestQueue.poll();
            Driver driver = drivers.iterator().next();
            drivers.remove(driver);

            Ride ride = new Ride(req.requestId, driver, req);
            completedRides.add(ride);

            System.out.println("Assigned: " + ride);
        }

        // Show completed rides
        System.out.println("\nCompleted Rides:");
        for (Ride r : completedRides) {
            System.out.println(r);
        }
    }
}