package in.itkaran.lld1130624.lld3.parkinglot.repositories;

import in.itkaran.lld1130624.lld3.parkinglot.models.ParkingFloor;

import java.util.Map;
import java.util.TreeMap;

public class ParkingFloorRepository {
    private Map<Long, ParkingFloor> parkingFloorMap = new TreeMap<>();
    private Long previousParkingFloorId = 0L;

    public ParkingFloor save(ParkingFloor parkingFloor) {
        if (parkingFloor.getId() == null) {
            previousParkingFloorId += 1;
            parkingFloor.setId(previousParkingFloorId);
        }
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        return parkingFloor;
    }

    public ParkingFloor findParkingFloorById(Long parkingFloorId) {

        return parkingFloorMap.get(parkingFloorId);
    }
}
