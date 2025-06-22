package dto.service;

import dto.interfaces.DisplayService;
import dto.interfaces.ParkingSpotService;
import dto.ParkingLot;
import dto.parkingspot.ParkingSpot;
import enums.ParkingSpotEnum;

import java.lang.reflect.InvocationTargetException;

public class ParkingSpotServiceImpl implements ParkingSpotService {

    DisplayService displayService = new DisplayServiceImpl();
    @Override
    public ParkingSpot create(ParkingSpotEnum parkingSpotEnum, Integer floor) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ParkingSpot parkingSpot = (ParkingSpot) parkingSpotEnum.getParkingSpot().getConstructor(Integer.class).newInstance(floor);
        ParkingLot.getInstance().getFreeParkingSpots().get(parkingSpotEnum).add(parkingSpot);
        displayService.update(parkingSpotEnum, 1);
        return parkingSpot;
    }
}
