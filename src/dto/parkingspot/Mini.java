package dto.parkingspot;

public class Mini extends ParkingSpot{

    protected Mini(int floorNum, int amount) {
        super(floorNum, amount);
    }

    @Override
    public int cost(int parkingHours) {
        return amount * parkingHours;
    }
}
