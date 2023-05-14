package RailwayTicketSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the train name: ");
        String trainName = scanner.nextLine();
        
        System.out.print("Enter the number of seats: ");
        int totalSeats = scanner.nextInt();
        
        ReservationSystem reservationSystem = new ReservationSystem(trainName, totalSeats);
        
        System.out.print("Enter the number of tickets to book: ");
        int numTickets = scanner.nextInt();
        
        for (int i = 0; i < numTickets; i++) {
            System.out.println("\nTicket " + (i + 1));
            
            System.out.print("Enter passenger name: ");
            scanner.nextLine(); // Consume newline character
            String passengerName = scanner.nextLine();
            
            System.out.print("Enter seat number: ");
            int seatNumber = scanner.nextInt();
            
            Ticket ticket = new Ticket(passengerName, seatNumber);
            
            if (reservationSystem.bookTicket(ticket)) {
                System.out.println("Ticket booked successfully!");
            } else {
                System.out.println("Sorry, the seat is already occupied.");
            }
        }
        
        System.out.println("\nReservation details:");
        reservationSystem.displayTickets();
        
        scanner.close();
    }
}
