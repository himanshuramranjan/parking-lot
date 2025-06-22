package dto.service;

import dto.parkingspot.ParkingTicket;
import dto.exceptions.InvalidTicketException;
import dto.exceptions.SpotNotFoundException;
import dto.interfaces.DisplayService;
import dto.interfaces.ParkingService;
import dto.parkingStrategy.Strategy;
import dto.ParkingLot;
import dto.parkingspot.ParkingSpot;
import dto.vehicle.Vehicle;
import enums.ParkingSpotEnum;

import java.util.List;

public class ParkingServiceImpl implements ParkingService {

    private Strategy parkingStrategy;
    private ParkingLot parkingLot;
    private DisplayService displayService;

    public ParkingServiceImpl(Strategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
        parkingLot = ParkingLot.getInstance();
        displayService = new DisplayServiceImpl();
    }
    @Override
    public ParkingTicket entry(Vehicle vehicle) throws SpotNotFoundException {
        ParkingSpotEnum parkingSpotEnum = vehicle.getParkingSpotEnum();
        List<ParkingSpot> freeParkingSpots = parkingLot.getFreeParkingSpots().get(parkingSpotEnum);
        List<ParkingSpot> occupiedParkingSpots = parkingLot.getFreeParkingSpots().get(parkingSpotEnum);

        ParkingSpot parkingSpot = parkingStrategy.findParkingSpot(parkingSpotEnum);

        if(parkingSpot.isFree()) {
            synchronized (parkingSpot) {
                if(parkingSpot.isFree()) {
                    parkingSpot.setFree(false);
                    freeParkingSpots.remove(parkingSpot);
                    occupiedParkingSpots.add(parkingSpot);
                    return new ParkingTicket(vehicle, parkingSpot);
                }
                // If one of the thread doesn't make it to the 'if' condition
                entry(vehicle);
            }
        }
        return null;
    }

    @Override
    public int exit(ParkingTicket parkingTicket, Vehicle vehicle) throws InvalidTicketException {
        if(parkingTicket.getVehicle().equals(vehicle)) {
            ParkingSpot parkingSpot = parkingTicket.getParkingSpot();
            int amount = parkingSpot.getAmount();
            parkingSpot.setFree(true);
            parkingLot.getOccupiedParkingSpots().get(vehicle.getParkingSpotEnum()).remove(parkingSpot);
            parkingLot.getFreeParkingSpots().get(vehicle.getParkingSpotEnum()).add(parkingSpot);
            displayService.update(vehicle.getParkingSpotEnum(), 1);
            return amount;
        } else {
            throw new InvalidTicketException("This is an invalid ticket");
        }
    }
}
