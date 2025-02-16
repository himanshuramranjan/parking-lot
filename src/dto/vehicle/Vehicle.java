package dto.vehicle;

import dto.parkingspot.ParkingLot;
import enums.ParkingSpotEnum;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Vehicle {

    private final AtomicInteger count = new AtomicInteger();

    int id;
    ParkingSpotEnum parkingSpotEnum;

    protected Vehicle(ParkingSpotEnum parkingSpotEnum){
        this.id = count.incrementAndGet();
        this.parkingSpotEnum = parkingSpotEnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSpotEnum getParkingSpotEnum() {
        return parkingSpotEnum;
    }

    public void setParkingSpotEnum(ParkingSpotEnum parkingSpotEnum) {
        this.parkingSpotEnum = parkingSpotEnum;
    }
}
