package in.itkaran.lld1130624.lld3.parkinglot.repositories;

import in.itkaran.lld1130624.lld3.parkinglot.models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Long, ParkingSpot> parkingSpotMap = new HashMap<>();
    private Long previousParkingSpotId = 0L;

    public ParkingSpot save(ParkingSpot parkingSpot) {
        if (parkingSpot.getId() == null) {
            previousParkingSpotId += 1;
            parkingSpot.setId(previousParkingSpotId);
        }
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot findParkingSpotById(Long parkingSpotId) {
        return parkingSpotMap.get(parkingSpotId);
    }
}
