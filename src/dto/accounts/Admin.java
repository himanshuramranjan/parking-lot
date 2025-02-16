package dto.accounts;

import dto.parkingspot.ParkingLot;

public class Admin extends Account {
    private ParkingLot parkingLot = ParkingLot.getInstance("Tech Park");

}
