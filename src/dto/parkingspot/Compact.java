package dto.parkingspot;

public class Compact extends ParkingSpot{

    protected Compact(int floorNum, int amount) {
        super(floorNum, amount);
    }

    @Override
    public int cost(int parkingHours) {
        return amount * parkingHours;
    }
}
