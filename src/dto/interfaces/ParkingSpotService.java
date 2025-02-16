package dto.interfaces;

import dto.parkingspot.ParkingSpot;
import enums.ParkingSpotEnum;

import java.lang.reflect.InvocationTargetException;

public interface ParkingSpotService {
    ParkingSpot create(ParkingSpotEnum parkingSpotEnum, Integer floor) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}
