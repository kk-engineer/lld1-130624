package in.itkaran.lld1130624.lld3.parkinglot.repositories;

import in.itkaran.lld1130624.lld3.parkinglot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
    private Long previousParkingLotId = 0L;

    public ParkingLot findParkingLotById(Long previousParkingLotId) {
        return parkingLotMap.get(previousParkingLotId);
    }

    public ParkingLot save(ParkingLot parkingLot) {
        if (parkingLot.getId() == null) {
            previousParkingLotId += 1;
            parkingLot.setId(previousParkingLotId);
        }
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        return parkingLot;
    }
}
