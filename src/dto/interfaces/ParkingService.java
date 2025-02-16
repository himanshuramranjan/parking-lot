package dto.interfaces;

import dto.accounts.ParkingTicket;
import dto.exceptions.InvalidTicketException;
import dto.exceptions.SpotNotFoundException;
import dto.vehicle.Vehicle;

public interface ParkingService {
    ParkingTicket entry(Vehicle vehicle) throws SpotNotFoundException;
    int exit(ParkingTicket parkingTicket, Vehicle vehicle) throws InvalidTicketException;
}
