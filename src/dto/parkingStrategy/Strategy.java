package dto.parkingStrategy;

import dto.parkingspot.ParkingSpot;
import enums.ParkingSpotEnum;

public interface Strategy {
    ParkingSpot findParkingSpot(ParkingSpotEnum parkingSpotEnum);
}
