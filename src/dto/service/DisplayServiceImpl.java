package dto.service;

import dto.interfaces.DisplayService;
import dto.parkingspot.DisplayBoard;
import enums.ParkingSpotEnum;

public class DisplayServiceImpl implements DisplayService {
    @Override
    public void update(ParkingSpotEnum parkingSpotEnum, Integer change) {
        int currentCount = DisplayBoard.getInstance().getFreeParkingSpots().get(parkingSpotEnum);
        int newCount = change + currentCount;
        DisplayBoard.getInstance().getFreeParkingSpots().replace(parkingSpotEnum, change);
    }
}
