package dto.interfaces;

import dto.accounts.ParkingTicket;
import dto.exceptions.InvalidTicketException;
import dto.vehicle.Vehicle;

public interface ParkingService {
    ParkingTicket entry(Vehicle vehicle);
    int exit(ParkingTicket parkingTicket, Vehicle vehicle) throws InvalidTicketException;
}
