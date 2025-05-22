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

public class Main {
    public static void main(String[] args) {
        
        Parking p = new ParkingLot();

        
        p.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        p.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        p.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));

        
        p.removeVehicle("XYZ789");

       
        p.displayAllVehicles();
    }
}