package dto.parkingspot;

public class Compact extends ParkingSpot{

    protected Compact(int id, int floorNum, int amount, boolean isFree) {
        super(floorNum, amount);
    }
}
