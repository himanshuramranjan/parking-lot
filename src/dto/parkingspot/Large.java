package dto.parkingspot;

public class Large extends ParkingSpot{
    protected Large(int floorNum, int amount) {
        super(floorNum, amount);
    }

    @Override
    public int cost(int parkingHours) {
        return amount * parkingHours;
    }
}
