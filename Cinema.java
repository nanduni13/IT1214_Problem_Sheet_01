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
        BookingSystem system = new BookingSystem();

        system.bookTicket(1, "Alice", 1);
        system.bookTicket(2, "Bob", 2);
        system.bookTicket(3, "Charlie", 3);

        system.cancelTicket(2);

        system.bookTicket(4, "David", 2); 

        system.displayBookings();
    }
}