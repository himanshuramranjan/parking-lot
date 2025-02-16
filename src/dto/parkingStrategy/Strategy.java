package dto.parkingStrategy;

import dto.exceptions.SpotNotFoundException;
import dto.parkingspot.ParkingSpot;
import enums.ParkingSpotEnum;

public interface Strategy {
    ParkingSpot findParkingSpot(ParkingSpotEnum parkingSpotEnum) throws SpotNotFoundException;
}
