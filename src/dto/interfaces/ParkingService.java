package dto.interfaces;

import dto.accounts.ParkingTicket;
import dto.vehicle.Vehicle;

public interface ParkingService {
    ParkingTicket entry(Vehicle vehicle);
    void exit(ParkingTicket parkingTicket, Vehicle vehicle);
}
