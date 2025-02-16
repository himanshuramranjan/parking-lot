package dto.interfaces;

import dto.parkingspot.ParkingSpot;
import enums.ParkingSpotEnum;

public interface ParkingSpotService {
    ParkingSpot create(ParkingSpotEnum parkingSpotEnum, Integer floor);
}
