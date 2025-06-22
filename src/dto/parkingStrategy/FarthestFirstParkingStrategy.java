package dto.parkingStrategy;

import dto.exceptions.SpotNotFoundException;
import dto.ParkingLot;
import dto.parkingspot.ParkingSpot;
import enums.ParkingSpotEnum;

import java.util.List;

public class FarthestFirstParkingStrategy implements Strategy{
    @Override
    public ParkingSpot findParkingSpot(ParkingSpotEnum parkingSpotEnum) throws SpotNotFoundException {
        List<ParkingSpot> parkingSpots = ParkingLot.getInstance().getFreeParkingSpots().get(parkingSpotEnum);
        if(parkingSpots.size() == 0) throw new SpotNotFoundException("Spot not found in farthest parking");
        return parkingSpots.get(parkingSpots.size() - 1);
    }
}
