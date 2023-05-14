package RailwayTicketSystem;

public class Ticket {
    private String passengerName;
    private int seatNumber;

    public Ticket(String passengerName, int seatNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
