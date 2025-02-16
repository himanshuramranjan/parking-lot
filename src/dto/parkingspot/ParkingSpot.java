package dto.parkingspot;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class ParkingSpot {

    private static final AtomicInteger count = new AtomicInteger();
    private int id;
    private int floorNum;
    protected int amount;
    private boolean isFree;

    protected ParkingSpot(int floorNum, int amount) {
        this.id = count.incrementAndGet();
        this.floorNum = floorNum;
        this.amount = amount;
        this.isFree = true;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public abstract int cost(int parkingHours);
}
