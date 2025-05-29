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
   
    
    }

    

}

public class Main {
    public static void main(String[] args) {
        
        
    }
}
