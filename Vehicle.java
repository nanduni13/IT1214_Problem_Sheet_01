class Vehicle1 {
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

    // Constructor
    public Vehicle(String licensePlate, String ownerName, int hoursParked) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.hoursParked = hoursParked;
    }

    // Getters
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getHoursParked() {
        return hoursParked;
    }

    // Display method
    public void displayDetails() {
        System.out.println("License: " + licensePlate + ", Owner: " + ownerName + ", Hours: " + hoursParked);
    }
}

class Parking {
    private Vehicle[] vehicles = new Vehicle[5];
    private int count = 0;

    // Add vehicle
    public void parkVehicle(Vehicle vehicle) {
        if (count < 5) {
            vehicles[count] = vehicle;
            count++;
        } else {
            System.out.println("Parking lot is full.");
        }
    }

    

}

public class Vehicle {
    public static void main(String[] args) {
        // Create parking lot instance
        Parking p = new Parking();

        

        // Display all parked vehicles
        p.displayAllVehicles();
    }
}