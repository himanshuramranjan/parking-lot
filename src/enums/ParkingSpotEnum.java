package enums;

import dto.parkingspot.Compact;
import dto.parkingspot.Large;
import dto.parkingspot.Mini;
import dto.parkingspot.ParkingSpot;

public enum ParkingSpotEnum {

    COMPACT(Compact.class),
    LARGE(Large.class),
    MINI(Mini.class);

    private Class parkingSpot;

    ParkingSpotEnum(Class parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Class getParkingSpot() {
        return parkingSpot;
    }
}
