package dto.parkingspot;

import java.util.HashMap;
import java.util.Map;

public class DisplayBoard {

    private static volatile DisplayBoard displayBoard;
    private Map<ParkingSpot, Integer> freeParkingSpots;

    private DisplayBoard() {
        freeParkingSpots = new HashMap<>();
    }

    public static DisplayBoard getInstance() {
        if(displayBoard == null) {
            synchronized (DisplayBoard.class) {
                if(displayBoard == null) {
                    displayBoard = new DisplayBoard();
                }
            }
        }
        return displayBoard;
    }

    public Map<ParkingSpot, Integer> getFreeParkingSpots() {
        return freeParkingSpots;
    }
}
