class Ticket {
    private int ticketNumber;
    private String customerName;
    private int seatNumber;

    public Ticket(int ticketNumber, String customerName, int seatNumber) {
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String toString() {
        return "Ticket #" + ticketNumber + ", Name: " + customerName + ", Seat: " + seatNumber;
    }
}

class BookingSystem {
    
    }

   

public class Cinema {
    public static void main(String[] args) {
       
    }
}
