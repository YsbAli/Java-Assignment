package RailwayTicketSystem;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private String trainName;
    private int totalSeats;
    private List<Ticket> tickets;

    public ReservationSystem(String trainName, int totalSeats) {
        this.trainName = trainName;
        this.totalSeats = totalSeats;
        this.tickets = new ArrayList<>();
    }

    public boolean bookTicket(Ticket ticket) {
        if (tickets.size() < totalSeats) {
            for (Ticket t : tickets) {
                if (t.getSeatNumber() == ticket.getSeatNumber()) {
                    return false; // Seat already occupied
                }
            }
            
            tickets.add(ticket);
            return true; // Ticket booked successfully
        }
        
        return false; // No more seats available
    }
    
    public void displayTickets() {
        for (Ticket ticket : tickets) {
            System.out.println("Passenger: " + ticket.getPassengerName() + ", Seat: " + ticket.getSeatNumber());
        }
    }
}
